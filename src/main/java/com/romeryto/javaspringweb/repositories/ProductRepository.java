package com.romeryto.javaspringweb.repositories;

import com.romeryto.javaspringweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
