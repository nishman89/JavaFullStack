package com.sparta.northwind.services;

import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer getCustomerByID(String id){
        if(id.length()>5){
            throw  new IllegalArgumentException("Can't have ID longer than 5 chars");
        } else {
            return customerRepository.findById(id).orElse(null);
        }
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
