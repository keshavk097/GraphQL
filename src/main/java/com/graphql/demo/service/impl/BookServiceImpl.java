package com.graphql.demo.service.impl;

import com.graphql.demo.model.Book;
import com.graphql.demo.repository.BookRepo;
import com.graphql.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book getBookById(int id) {
        return this.bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book is not found with Id:"+ id));
    }
}
