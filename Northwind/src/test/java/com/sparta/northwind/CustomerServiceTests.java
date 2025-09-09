package com.sparta.northwind;

import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.repositories.CustomerRepository;
import com.sparta.northwind.services.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CustomerServiceTests {

    private final CustomerRepository mockRepository = Mockito.mock(CustomerRepository.class);
    private CustomerService sut = new CustomerService(mockRepository);

    // Dummies

    @Test
    @DisplayName("Ensure CustomerService is constructed correctly")
    public void constructServiceTest(){
        Assertions.assertInstanceOf(CustomerService.class, sut);
    }

    @Test
    @DisplayName("Constructor should throw exception with null repository")
    public void constructorWtihNullRepositoryTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CustomerService(null));
    }

    // Stuvs: Test specfic behaviour

    @Test
    @DisplayName("Get all customers test")
    public void getAllCustomersTest(){
        // Arrange
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setCustomerID("MANDA");
        Customer customer2 = new Customer();
        customer2.setCustomerID("WINDR");
        customers.add(customer1);
        customers.add(customer2);

        //// Define mock beahviour - create the STUB
        Mockito.when(mockRepository.findAll()).thenReturn(customers);

        // Act
        List<Customer> result = sut.getAllCustomers();

        // Assert
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(result.get(0).getCustomerID(), "MANDA");
        Assertions.assertEquals(result.get(1).getCustomerID(), "WINDR");
    }


    @Test
    @DisplayName("Get Customer Happy Path")
    public void getAllCustomerTest(){

        // Arrange
        Customer customer = new Customer();
        customer.setCustomerID("MANDA");
        customer.setCity("Birmingham");
        customer.setCompanyName("Sparta Global");
        customer.setContactName("Nish Mandal");

        Mockito.when(mockRepository.findById("MANDA")).thenReturn(Optional.of(customer));

        // Act

        Customer result = sut.getCustomerByID("MANDA");

        Assertions.assertNotNull(result, "Customer should not be null");
        Assertions.assertEquals("MANDA", result.getCustomerID(), "Customer ID should match");

    }


    @Test
    @DisplayName("Get Customer Unhappy Path")
    public void findCustomerUnhappyPathTests(){
        Mockito.when(mockRepository.findById(Mockito.anyString())).thenReturn(Optional.empty());
        Assertions.assertThrows(NoSuchElementException.class, () -> sut.getCustomerByID("ABCDE"));
    }


    // Create tests for the save customer, delete and updatemethods (Happy and Sad)
}
