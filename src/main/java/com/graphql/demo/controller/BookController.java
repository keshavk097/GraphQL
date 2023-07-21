package com.graphql.demo.controller;

import com.graphql.demo.model.Book;
import com.graphql.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.create(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
    return this.bookService.getAll();
    }

    @GetMapping("/find")
    public Book getBook(@RequestParam(value = "id") int id){
        return bookService.getBookById(id);
    }
}
