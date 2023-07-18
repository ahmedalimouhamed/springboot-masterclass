package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
                new Customer(1L, "fake James Bond", "password 123", "email"),
                new Customer(1L, "fake Jhon doe", "123 password 123", "email")
        );
    }

}
