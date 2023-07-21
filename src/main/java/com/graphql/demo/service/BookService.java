package com.graphql.demo.service;

import com.graphql.demo.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    Book create(Book book);
    List<Book> getAll();
    Book getBookById(int id);
}
