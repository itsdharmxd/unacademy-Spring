package com.springboot.dharmesh.Dao;
import java.util.Optional;

import com.springboot.dharmesh.entities.UserType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserTypeDao extends JpaRepository<UserType, Integer> {
    public Optional<UserType> findByUserTypeName(String userTypeName);
}
