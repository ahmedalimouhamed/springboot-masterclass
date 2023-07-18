package com.example.demo.customer;


import com.example.demo.exception.ApiRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/customers")
@Deprecated
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long  id){
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long  id){
        throw new ApiRequestException("api request exception for customer "+id);
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer){
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
