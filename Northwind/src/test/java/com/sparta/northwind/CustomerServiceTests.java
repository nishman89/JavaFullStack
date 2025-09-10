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

import static org.hamcrest.Matchers.contains;

class CustomerServiceTests {

    private final CustomerRepository mockRepository = Mockito.mock(CustomerRepository.class);
    private final CustomerMapper customerMapper = Mockito.mock(CustomerMapper.class);
    private final CustomerService sut = new CustomerService(mockRepository, customerMapper);

    @Test
    @DisplayName("Construct Service")
    public void constructServiceTest(){
        Assertions.assertInstanceOf(CustomerService.class, sut, "sut should be an instance of CustomerService");
    }

    @Test
    @DisplayName("Get All Customers Test")
    public void getAllCustomersTest() {

        // Arrange
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setCustomerID("MANDA");
        Customer customer2 = new Customer();
        customer1.setCustomerID("WINDR");
        customers.add(customer1);
        customers.add(customer2);

        CustomerDTO dto1 = new CustomerDTO();
        dto1.setCustomerID("MANDA");
        CustomerDTO dto2 = new CustomerDTO();
        dto2.setCustomerID("WINDR");

        Mockito.when(customerMapper.toDTO(customer1)).thenReturn(dto1);
        Mockito.when(customerMapper.toDTO(customer2)).thenReturn(dto2);
        // Define Mock Behaviours
        Mockito.when(mockRepository.findAll()).thenReturn(customers);

        //Act
        List<CustomerDTO> result = sut.getAllCustomers();
        Assertions.assertEquals(2, result.size());
        Assertions.assertTrue(result.get(0).getCustomerID().equals("MANDA"));
        Assertions.assertTrue(result.get(1).getCustomerID().equals("WINDR"));
    }
    @Test
    @DisplayName("Get Customer Happy Path")
    public void getCustomerTest() {
        Customer customer = new Customer();
        customer.setCustomerID("MANDA");
        customer.setCity("Birmingham");
        customer.setCompanyName("Sparta Global");
        customer.setContactName("Nish Mandal");

        CustomerDTO customerDto = new CustomerDTO();
        customerDto.setCustomerID("MANDA");
        customerDto.setCity("Birmingham");
        customerDto.setCompanyName("Sparta Global");
        customerDto.setContactName("Nish Mandal");

        // Define mock behavior
        Mockito.when(customerMapper.toDTO(customer)).thenReturn(customerDto);
        Mockito.when(mockRepository.findById("MANDA")).thenReturn(java.util.Optional.of(customer));

        // Act: Call the method under test
        CustomerDTO result = sut.getCustomerById("MANDA");

        // Assert: Verify the result
        Assertions.assertNotNull(result, "Customer should not be null");
        Assertions.assertEquals("MANDA", result.getCustomerID(), "Customer ID should match");
    }



    @Test
    @DisplayName("Get Customer Unhappy Path")
    public void findCustomerUnhappyPathTest() {
        // arrange
        Mockito.when(mockRepository.findById(Mockito.anyString())).thenReturn(null);
        // act and assert
        Assertions.assertThrows(NullPointerException.class, () -> sut.getCustomerById("MANDA"));
    }





    @Test
    @DisplayName("Save Customer — Happy Path")
    void saveCustomerHappyPathTest() {
        Customer customer = new Customer();
        customer.setCustomerID("MANDA");

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerID("MANDA");

        Mockito.when(customerMapper.toEntity(customerDTO)).thenReturn(customer);
        Mockito.when(mockRepository.save(customer)).thenReturn(customer);
        Mockito.when(customerMapper.toDTO(customer)).thenReturn(customerDTO);

        CustomerDTO savedCustomer = sut.saveCustomer(customerDTO);

        Assertions.assertNotNull(savedCustomer);
        Assertions.assertEquals("MANDA", savedCustomer.getCustomerID());

        Mockito.verify(customerMapper).toEntity(customerDTO);   // ✅ verify this
        Mockito.verify(mockRepository).save(customer);
        Mockito.verify(customerMapper).toDTO(customer);
        Mockito.verifyNoMoreInteractions(mockRepository, customerMapper);
    }

    @Test
    @DisplayName("Delete Customer Happy Path")
    public void deleteCustomerHappyPathTest() {
        Mockito.when(mockRepository.existsById("MANDA")).thenReturn(true);

        boolean result = sut.deleteCustomer("MANDA");

        Assertions.assertTrue(result, "The customer should be deleted successfully");
        Mockito.verify(mockRepository, Mockito.times(1)).deleteById("MANDA");
    }

    @Test
    @DisplayName("Delete Customer Unhappy Path")
    public void deleteCustomerUnhappyPathTest() {
        Mockito.when(mockRepository.existsById("MANDA")).thenReturn(false);

        boolean result = sut.deleteCustomer("MANDA");

        Assertions.assertFalse(result, "The customer should not be deleted as it does not exist");
        Mockito.verify(mockRepository, Mockito.never()).deleteById("MANDA");
    }
}