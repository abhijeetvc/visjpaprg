package com.visjpa.visjpaprg.controller;

import com.visjpa.visjpaprg.model.Customer;
import com.visjpa.visjpaprg.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value="/savecustomer")
    public String saveData(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer saved";
    }
}
