package com.sparta.northwind.repositories;

import com.sparta.northwind.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
