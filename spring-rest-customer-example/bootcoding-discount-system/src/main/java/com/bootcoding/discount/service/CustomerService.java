package com.bootcoding.discount.service;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.utils.CityGenrator;
import com.bootcoding.discount.utils.NameGenerator;
import com.bootcoding.discount.utils.OrderCountGenertor;
import com.bootcoding.discount.utils.VisitCountGenrator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    private static final int MAX_LIMIT = 100;
    public List<Customer> getAllCustomer(){
        List<Customer> customers = new ArrayList<>();
        for (int i=0;i<MAX_LIMIT;i++){
           Customer customer = buildCustomer();
            customers.add(customer);
        }
        return customers;
    }

    private Customer buildCustomer() {
        Customer customer = new Customer();
        customer.setName(NameGenerator.getName());
        customer.setCity(CityGenrator.getCity());
        customer.setOrderCount(OrderCountGenertor.getOrderCount());
        customer.setVisitsCount(VisitCountGenrator.getOrderCount());
         return customer;
    }
}
