package com.example.book_store.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  Id;
    @Column
    private String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @OneToMany(mappedBy = "customers")
    @JoinColumn(name = "books")
    @JsonIgnore

    private List<Book> books;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="order_id", referencedColumnName = "id")
    private Order order;
}
