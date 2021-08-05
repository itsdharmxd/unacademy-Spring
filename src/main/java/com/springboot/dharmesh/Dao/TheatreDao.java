package com.springboot.dharmesh.Dao;

import com.springboot.dharmesh.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreDao extends JpaRepository<Theatre,Integer> {
    public List<Theatre> findByTheatreName(String theatreName);
    public List<Theatre> findByTicketPriceLessThan(float price);
    public List<Theatre> findByTheatreNameContaining(String theatreName);
}
