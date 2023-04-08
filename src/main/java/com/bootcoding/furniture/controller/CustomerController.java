package com.bootcoding.furniture.controller;

import com.bootcoding.furniture.modal.Customer;
import com.bootcoding.furniture.service.CustomerService;
import com.bootcoding.match.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @PostMapping("/addCustomer")
    public Customer createCustomer(@RequestBody Customer addCustomer){
        customerService.getAllCustomer();
        return addCustomer;
    }
}
