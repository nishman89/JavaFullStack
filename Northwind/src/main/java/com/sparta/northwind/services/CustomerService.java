// Service
package com.sparta.northwind.services;

import com.sparta.northwind.dtos.CustomerDTO;
import com.sparta.northwind.dtos.CustomerMapper;
import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper){
        if (customerRepository == null) throw new IllegalArgumentException("Repository cannot be null");
        if (customerMapper == null) throw new IllegalArgumentException("Mapper cannot be null");
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public List<CustomerDTO> getAllCustomers(){
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDTO> customerDtos = new ArrayList<>();
        for (Customer customer : customers) {
            customerDtos.add(customerMapper.toDTO(customer));
        }
        return customerDtos;
    }

    public CustomerDTO getCustomerById(String id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Customer not found"));
        return customerMapper.toDTO(customer);
    }

    // Controller passes DTO; service maps + persists
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        Customer entity = customerMapper.toEntity(customerDTO);
        Customer saved = customerRepository.save(entity);
        return customerMapper.toDTO(saved);
    }

    public boolean deleteCustomer(String id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        String id = customerDTO.getCustomerID();
        if (!customerRepository.existsById(id)) {
            throw new NoSuchElementException("Customer with ID " + id + " does not exist.");
        }
        Customer entity = customerMapper.toEntity(customerDTO);
        Customer saved = customerRepository.save(entity);
        return customerMapper.toDTO(saved);
    }
}
