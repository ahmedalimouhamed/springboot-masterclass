package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerRepositoryOther  implements CustomerRepo{
    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
                new Customer(4L, "other james bond", "password 987", "email"),
                new Customer(5L, "other Jhon doe", "password 222", "email"),
                new Customer(6L, "ahmed", "password 111", "email")
        );
    }
}
