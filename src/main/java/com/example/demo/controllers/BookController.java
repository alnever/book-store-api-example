package com.example.demo.controllers;

import com.example.demo.db.model.Book;
import com.example.demo.db.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BookController {

    private final BooksRepository booksRepository;

    public BookController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping("/books")
    public Iterable<Book> index() {
        return this.booksRepository.findAll();
    }
}
