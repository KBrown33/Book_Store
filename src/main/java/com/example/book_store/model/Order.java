package com.example.book_store.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@TypeDef(name = "string-array", typeClass = StringArrayType.class)
public class Order {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "text[]")
    @Type(type = "string-array")
    private String[ ] booknames;
    @Column
    private Long customerId;
    @Column
    private Date check_out_date;
    @Column
    private Date due_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getBooknames() {
        return booknames;
    }

    public void setBooknames(String[] booknames) {
        this.booknames = booknames;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(Date check_out_date) {
        this.check_out_date = check_out_date;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }
    @OneToOne(mappedBy = "customers")
    @JsonIgnore

    private Customer customer;
}
