package com.sparta.northwind.services;

import com.sparta.northwind.dtos.CustomerDTO;
import com.sparta.northwind.dtos.CustomerMapper;
import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper){
        if (customerRepository == null) {
            throw new IllegalArgumentException("Repository cannot be null");
        }
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public List<CustomerDTO> getAllCustomers(){
        //return customerRepository.findAll().stream().map(customerMapper::toDTO).toList();
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDTO> customerDtos = new ArrayList<>();
        for(Customer customer:customers){
            CustomerDTO customerDTO = customerMapper.toDTO(customer);
            customerDtos.add(customerDTO);
        }
        return  customerDtos;
    }

    public CustomerDTO getCustomerById(String id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Customer not found"));
        return customerMapper.toDTO(customer);
    }



    public CustomerDTO saveCustomer(Customer customer) {
        return customerMapper.toDTO(customerRepository.save(customer));
    }
    public boolean deleteCustomer(String id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public CustomerDTO updateCustomer(Customer customer) {
        if (customerRepository.existsById(customer.getCustomerID())) {
            return customerMapper.toDTO(customerRepository.save(customer));
        } else {
            throw new IllegalArgumentException("Customer with ID " + customer.getCustomerID() + " does not exist.");
        }
    }
}
