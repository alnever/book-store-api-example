package com.example.demo.db.repositories;

import com.example.demo.db.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book, Long> {
}
