package com.romeryto.javaspringweb.repositories;

import com.romeryto.javaspringweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
