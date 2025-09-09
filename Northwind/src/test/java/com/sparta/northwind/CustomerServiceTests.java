package com.sparta.northwind;

import com.sparta.northwind.dtos.CustomerDTO;
import com.sparta.northwind.dtos.CustomerMapper;
import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.repositories.CustomerRepository;
import com.sparta.northwind.services.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CustomerServiceTests {

    private final CustomerMapper customerMapper = Mockito.mock(CustomerMapper.class);
    private final CustomerRepository mockRepository = Mockito.mock(CustomerRepository.class);
    private CustomerService sut = new CustomerService(mockRepository,customerMapper);

    // Dummies

//    @Test
//    @DisplayName("Ensure CustomerService is constructed correctly")
//    public void constructServiceTest(){
//        Assertions.assertInstanceOf(CustomerService.class, sut);
//    }
//
//    @Test
//    @DisplayName("Constructor should throw exception with null repository")
//    public void constructorWtihNullRepositoryTest(){
//        Assertions.assertThrows(IllegalArgumentException.class, () -> new CustomerService(null));
//    }

    // Stub: Test specfic behaviour

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

        CustomerDTO dto1 = new CustomerDTO();
        dto1.setCustomerID("MANDA");
        CustomerDTO dto2 = new CustomerDTO();
        dto2.setCustomerID("WINDR");

        Mockito.when(customerMapper.toDTO(customer1)).thenReturn(dto1);
        Mockito.when(customerMapper.toDTO(customer2)).thenReturn(dto2);
        //// Define mock beahviour - create the STUB
        Mockito.when(mockRepository.findAll()).thenReturn(customers);

        // Act
        List<CustomerDTO> result = sut.getAllCustomers();

        // Assert
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(result.get(0).getCustomerID(), "MANDA");
        Assertions.assertEquals(result.get(1).getCustomerID(), "WINDR");
    }

//
//    @Test
//    @DisplayName("Get Customer Happy Path")
//    public void getAllCustomerTest(){
//
//        // Arrange
//        Customer customer = new Customer();
//        customer.setCustomerID("MANDA");
//        customer.setCity("Birmingham");
//        customer.setCompanyName("Sparta Global");
//        customer.setContactName("Nish Mandal");
//
//        Mockito.when(mockRepository.findById("MANDA")).thenReturn(Optional.of(customer));
//
//        // Act
//
//        Customer result = sut.getCustomerByID("MANDA");
//
//        Assertions.assertNotNull(result, "Customer should not be null");
//        Assertions.assertEquals("MANDA", result.getCustomerID(), "Customer ID should match");
//
//    }
//
//
//    @Test
//    @DisplayName("Get Customer Unhappy Path")
//    public void findCustomerUnhappyPathTests(){
//        Mockito.when(mockRepository.findById(Mockito.anyString())).thenReturn(Optional.empty());
//        Assertions.assertThrows(NoSuchElementException.class, () -> sut.getCustomerByID("ABCDE"));
//    }
//
//    @Test
//    @DisplayName("Save Customer Happy Path")
//    public void saveCustomerHappyPathTest() {
//        Customer customer = new Customer();
//        customer.setCustomerID("MANDA");
//        customer.setCity("Birmingham");
//        customer.setCompanyName("Sparta Global");
//        customer.setContactName("Nish Mandal");
//
//        Mockito.when(mockRepository.save(customer)).thenReturn(customer);
//
//        Customer savedCustomer = sut.saveCustomer(customer);
//
//        Assertions.assertNotNull(savedCustomer, "The saved customer should not be null");
//        Assertions.assertEquals("MANDA", savedCustomer.getCustomerID(), "Customer ID should match");
//    }
//
//    @Test
//    @DisplayName("Save Customer Unhappy Path")
//    public void saveCustomerUnhappyPathTest() {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> sut.saveCustomer(null),
//                "Expected IllegalArgumentException when saving a null customer");
//    }
//
//    @Test
//    @DisplayName("Update Customer Happy Path")
//    public void updateCustomerHappyPathTest() {
//        Customer customer = new Customer();
//        customer.setCustomerID("MANDA");
//
//        Mockito.when(mockRepository.existsById("MANDA")).thenReturn(true);
//        Mockito.when(mockRepository.save(customer)).thenReturn(customer);
//
//        Customer updatedCustomer = sut.updateCustomer(customer);
//
//        Assertions.assertNotNull(updatedCustomer, "Updated customer should not be null");
//        Assertions.assertEquals("MANDA", updatedCustomer.getCustomerID(), "Customer ID should match");
//    }
//
//    @Test
//    @DisplayName("Update Customer Unhappy Path")
//    public void updateCustomerUnhappyPathTest() {
//        Customer customer = new Customer();
//        customer.setCustomerID("MANDA");
//
//        Mockito.when(mockRepository.existsById("MANDA")).thenReturn(false);
//
//        Assertions.assertThrows(IllegalArgumentException.class, () -> sut.updateCustomer(customer),
//                "Expected IllegalArgumentException when updating a non-existent customer");
//    }
//
//
//    @Test
//    @DisplayName("Save customer happy path")
//    public void saveCustomerHappyPath(){
//        Customer customer = new Customer();
//        customer.setCustomerID("NISHY");
//        Mockito.when(mockRepository.save(customer)).thenReturn(customer);
//
//        Customer savedCustomer = sut.saveCustomer(customer);
//
//        Mockito.verify(mockRepository, Mockito.atLeast(1)).save(customer);
//    }


}
