package com.example.demo.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/v2/customer")
public class CustomerControllerv2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerv2(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping(value="all")
    List<Customer> getCustomer(){

        return Arrays.asList(new Customer(0L, "v2", "v2", "email"));
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("Post Request ...");
        System.out.println(customer);
    }

    @DeleteMapping(path= "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long  id){
        System.out.println("Delete Request For customer with id "+id);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("Update request ...");
        System.out.println(customer);
    }

}
