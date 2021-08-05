package com.springboot.dharmesh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int bookingId;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column(nullable = false)
    private int noOfSeats;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", noOfSeats=" + noOfSeats + '}';
    }
}
