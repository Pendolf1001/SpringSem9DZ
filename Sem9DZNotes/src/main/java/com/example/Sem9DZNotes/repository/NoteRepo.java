package com.example.Sem9DZNotes.repository;

import com.example.Sem9DZNotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {


}
