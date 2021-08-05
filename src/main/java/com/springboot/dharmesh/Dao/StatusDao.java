package com.springboot.dharmesh.Dao;

import com.springboot.dharmesh.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<Status,Integer> {
    public Status findByStatusName(String statusName);
}
