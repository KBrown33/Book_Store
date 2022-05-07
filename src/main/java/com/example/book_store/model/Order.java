package com.example.book_store.model;



import javax.persistence.*;

@Entity
@Table(name = "customerOrders")
public class Order {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String booknames;
    @Column
    private Integer customerId;
    @Column
    private Integer check_out_date;
    @Column
    private Integer due_date;
}
