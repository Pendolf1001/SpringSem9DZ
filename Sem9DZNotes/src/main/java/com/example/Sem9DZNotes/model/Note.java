package com.example.Sem9DZNotes.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Data
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column( nullable=false)
    private String title;


    @Column( nullable=false)
    private String content;




    @Column(  nullable=false)
    @CreationTimestamp
    private LocalDateTime createdAt;

}
