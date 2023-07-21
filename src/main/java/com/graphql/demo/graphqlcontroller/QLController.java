package com.graphql.demo.graphqlcontroller;

import com.graphql.demo.model.Book;
import com.graphql.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QLController {

    @Autowired
    private BookService bookService;
    @QueryMapping("getAllBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book getBook(@Argument int bookId){
        return bookService.getBookById(bookId);
    }


}
