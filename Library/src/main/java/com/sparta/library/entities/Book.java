package com.sparta.library.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Title", nullable = false)
    private String title; // Renamed to lowercase 'title'

    @ManyToOne(fetch = FetchType.EAGER)
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title; // Updated getter
    }

    public void setTitle(String title) {
        this.title = title; // Updated setter
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}