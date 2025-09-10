package com.sparta.library;

import com.sparta.library.entities.Author;
import com.sparta.library.entities.Book;
import com.sparta.library.repositories.AuthorRepository;
import com.sparta.library.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);

        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
        BookRepository booksRepository = context.getBean(BookRepository.class);
        List<Book> books = booksRepository.findAll();
        List<Author> authors = authorRepository.findAll();
        for(Author author : authors){
            System.out.println(author.getFullName());
        }
        for(Book book : books){
            System.out.println(book.getTitle() + " by: " + book.getAuthor().getFullName());
        }
        System.out.println();
        List<Book> books2 = booksRepository.findByTitleContainingIgnoreCase("LO");
        for(Book book : books2){
            System.out.println(book.getTitle());
        }
    }

}
