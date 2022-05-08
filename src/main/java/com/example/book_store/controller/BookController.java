package com.example.book_store.controller;

import com.example.book_store.exception.InformationNotFoundException;
import com.example.book_store.model.Book;
import com.example.book_store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path ="/api")
public class BookController {

    private BookService bookService;

    @Autowired
   @GetMapping("/books/")
    public List<Book> getAllBook() {

        return bookService.getAllBooks();
    }

    @GetMapping("/books/{bookId}/")
    public Optional<Book> getBook(@PathVariable(value = "bookId") Long bookId) {


        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            return book;
        } else {
            throw new InformationNotFoundException("Book with Id" + bookId + "not found");
        }
    }
}
