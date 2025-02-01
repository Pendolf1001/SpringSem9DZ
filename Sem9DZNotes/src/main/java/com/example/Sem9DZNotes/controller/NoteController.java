package com.example.Sem9DZNotes.controller;


import com.example.Sem9DZNotes.model.Note;
import com.example.Sem9DZNotes.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/notes")
public class NoteController {



    private final NoteService service;

    @GetMapping
    public ResponseEntity<List<Note>> getAllProduct(){
        return new ResponseEntity<>(service.getAllNote(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note){
        return new  ResponseEntity<>(service.createNote(note),HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable("id") Long id){

        Note noteById;
        try {
            noteById = service.getNoteById(id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Note());
        }

        return new ResponseEntity<>(noteById, HttpStatus.OK);

    }


    @PutMapping
    public ResponseEntity<Note> updateProduct( @RequestBody Note note){
        return new ResponseEntity<>(service.updateNote(note), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id){
        service.deleteNote(id);
        return ResponseEntity.ok().build();
    }



}
