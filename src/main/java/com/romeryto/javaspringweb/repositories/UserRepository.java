package com.romeryto.javaspringweb.repositories;

import com.romeryto.javaspringweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
