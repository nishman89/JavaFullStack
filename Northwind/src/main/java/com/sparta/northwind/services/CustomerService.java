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
            throw  new IllegalArgumentException("Can't have ID longer than 5 characters");
        } else {
            return customerRepository.findById(id).orElse(null);
        }
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public boolean deleteCustomerById(String id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Customer updateCustomer(Customer customer) {
        if (customerRepository.existsById(customer.getCustomerID())) {
            return customerRepository.save(customer);
        } else {
            throw new IllegalArgumentException("Customer with ID " + customer.getCustomerID() + " does not exist.");
        }
    }
}
