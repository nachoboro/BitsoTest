package org.example.bitso.controller;

import org.example.bitso.model.Order;
import org.example.bitso.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public Order getOrder(@RequestParam Long id) {
        Optional<Order> order = orderService.getOrder(id);
        return (Order) order.orElse(null);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}
