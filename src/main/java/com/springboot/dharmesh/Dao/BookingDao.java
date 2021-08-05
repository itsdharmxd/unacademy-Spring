package com.springboot.dharmesh.Dao;

import com.springboot.dharmesh.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking,Integer> {
}
