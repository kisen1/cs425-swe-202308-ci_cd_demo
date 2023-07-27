package edu.miu.cs.cs425.model;

import java.time.LocalDate;

public class Customer {
    private Integer customerId;
    private String name;
    private LocalDate dateOfBirth;

    public Customer(Integer customerId, String name, LocalDate dateOfBirth) {
        this.customerId = customerId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
    }
    
}
