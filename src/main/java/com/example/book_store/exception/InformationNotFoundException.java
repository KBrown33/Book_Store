package com.example.book_store.exception;

public class InformationNotFoundException extends RuntimeException  {

    public InformationNotFoundException(String message){
        super(message);
    }
}
