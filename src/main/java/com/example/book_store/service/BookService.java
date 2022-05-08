package com.example.book_store.service;

import com.example.book_store.repository.BookRepository;
import com.example.book_store.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookrepository;

    private CustomerRepository customerRepository;


    @Autowired
public void setCustomerRepository(CustomerRepository customerRepository) { this.customerRepository = customerRepository;}

}
