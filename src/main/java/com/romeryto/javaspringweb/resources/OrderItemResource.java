package com.romeryto.javaspringweb.resources;

import com.romeryto.javaspringweb.entities.OrderItem;
import com.romeryto.javaspringweb.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order_items")
public class OrderItemResource {

    @Autowired
    private OrderItemService service;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll() {
        List<OrderItem> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Long id) {
        OrderItem obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
