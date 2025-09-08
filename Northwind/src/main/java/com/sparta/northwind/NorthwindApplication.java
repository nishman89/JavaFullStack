package com.sparta.northwind;

import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.repositories.CustomerRepository;
import com.sparta.northwind.services.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class NorthwindApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(NorthwindApplication.class, args);

//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
//
//        List<Customer> customers = customerRepository.findAll();
//        for(Customer customer: customers){
//            System.out.println(customer);
//        }

        CustomerService customerService = context.getBean(CustomerService.class);

        // --- Create (save) ---
        String id = "MANDA"; // <=5 chars due to your validation
        Customer nish = new Customer();
        nish.setCustomerID(id);
        nish.setCompanyName("Sparta Global");
        nish.setContactName("Nish Mandal");
        nish.setCity("London"); // optional, add more fields if your schema requires
        customerService.saveCustomer(nish);
        System.out.println("Saved customer: " + id);

        // --- Get by ID ---
        Customer got = customerService.getCustomerByID(id);
        System.out.println("Got by ID: " + got);

        // --- (Optional) Find all, to verify it’s there ---
        customerService.getCustomerByID(id);

    // --- Delete with required message on failure ---
        try {
            boolean deleted = customerService.deleteCustomerById(id);
            if (!deleted) {
                System.out.println("Unsucessful delete");
            } else {
                System.out.println("Deleted: " + id);
            }
        } catch (Exception e) {
            System.out.println("Unsucessful delete");
        }


    }

}
