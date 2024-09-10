package com.booleanuk.api.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private int authorId;

    @Column
    private int publisherId;

    /*
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    //@JoinColumn(name = "publisher_id", nullable = false)
    @JsonIncludeProperties(value = {"firstName", "lastName", "email", "alive"})
    private Author author;
    //private Publisher publisher;

     */

    public Book(String title, String genre, int authorId, int publisherId){
        this.title = title;
        this.genre = genre;
        this.authorId = authorId;
        this.publisherId = publisherId;
    }

    public Book(int id){
        this.id = id;
    }
}
