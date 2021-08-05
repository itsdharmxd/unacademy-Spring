package com.springboot.dharmesh.entities;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column(length = 20, nullable = false, unique = true)
    private String username;

    @Column(length = 20, nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" + "customerId=" + customerId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
                + ", username='" + username + '\'' + ", password='" + password + '\'' + ", dateOfBirth=" + dateOfBirth + '}';
    }
}
