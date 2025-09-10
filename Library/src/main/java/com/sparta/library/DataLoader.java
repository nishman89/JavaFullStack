package com.sparta.library;

import com.sparta.library.entities.Author;
import com.sparta.library.entities.Book;
import com.sparta.library.repositories.AuthorRepository;
import com.sparta.library.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
public class DataLoader {

    @Bean
    @Transactional
    public CommandLineRunner loadData(AuthorRepository authorRepository, BookRepository bookRepository) {
        return args -> {
            System.out.println("DataLoader running...");
            if (authorRepository.count() == 0) {
                var tolkien = new Author("JRR Tolkien");
                var adams   = new Author("Douglas Adams");

                authorRepository.save(tolkien);
                authorRepository.save(adams);

                bookRepository.save(new Book("LOTR: Fellowship of the Ring", tolkien));
                bookRepository.save(new Book("The Hitchhiker's Guide", adams));

                System.out.println("Seed data added");
            } else {
                System.out.println("Seed skipped");
            }
        };
    }
}
