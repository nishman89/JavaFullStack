package com.sparta.northwind.controllers;

import com.sparta.northwind.dtos.CustomerDTO;
import com.sparta.northwind.dtos.CustomerMapper;
import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;

import org.hibernate.annotations.Cascade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@Controller and @ResponseBody
@RequestMapping("/customers")
public class CustomerController {


    private final CustomerService service;

    public CustomerController(CustomerService service){

        this.service = service;
    }


    @Operation(summary = "Get all customers", description = "Retrieve a list of all customers")
    @GetMapping(value = "/")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<CustomerDTO> customers = service.getAllCustomers();
        return ResponseEntity.ok(customers);
    }


    @Operation(summary = "Get a customer by ID", description = "Retrieve a customer from the database using their unique ID")
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable String id) {
        CustomerDTO customer = service.getCustomerById(id);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Add a new customer", description = "Create a new customer in the database")
    @PostMapping
    public ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO savedCustomer = service.saveCustomer(customerDTO);
        return ResponseEntity.status(201).body(savedCustomer);
    }

    @Operation(summary = "Update a customer", description = "Update an existing customer in the database")
    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable String id, @RequestBody CustomerDTO customerDTO) {
        customerDTO.setCustomerID(id);
        try {
            CustomerDTO updatedCustomer = service.updateCustomer(customerDTO);
            return ResponseEntity.ok(updatedCustomer);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Delete a customer", description = "Delete a customer from the database using their unique ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        boolean deleted = service.deleteCustomer(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
