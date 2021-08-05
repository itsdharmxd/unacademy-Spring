package com.springboot.dharmesh.Dao;
import java.util.Optional;

import com.springboot.dharmesh.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String username);
}
