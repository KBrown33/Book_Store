package com.example.book_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
            throw new InformationNotFoundException("Book with Id" + bookId + "not found")
        }
    }

    @PostMapping("/orders/")
    public Order  createOrder (@RequestBody Order orderObject){
       return orderService.createOrder(orderObject);
    }

    @GetMapping("orders/{orderId")
    public Optional<Orders> getOrder(@PathVariable(value = "orderId") Long orderId){

        Optional<Order> order = orderRepository.findById(orderId);
        if (order.isPresent()) {
            return order;
        } else {
            throw new InformationNotFoundException("Order Id number" + orderId + "not found")
        }
    }
}
