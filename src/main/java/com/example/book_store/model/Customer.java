package com.example.book_store.model;

import javax.persistence.*;

@Entity
@Table(name = "customernNames")
public class Customer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  Id;
    @Column
    private String name;
}
