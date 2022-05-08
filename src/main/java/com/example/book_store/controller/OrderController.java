package com.example.book_store.controller;

import com.example.book_store.exception.InformationNotFoundException;
import com.example.book_store.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class OrderController {

    private OrderService orderService;


    @Autowired

    @GetMapping("orders/{orderId")
    public Optional<Orders> getOrder(@PathVariable(value = "orderId") Long orderId)
    {

        Optional<Order> order = orderRepository . findById (orderId);
        if (order.isPresent()) {
            return order;
        } else {
            throw new InformationNotFoundException("Order Id number" + orderId + "not found")
        }
    }

    @PostMapping("/orders/")
    public Order  createOrder (@RequestBody Order orderObject){
        return orderService.createOrder(orderObject);
    }
}
