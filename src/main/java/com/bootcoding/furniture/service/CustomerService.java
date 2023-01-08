package com.bootcoding.furniture.service;

import com.bootcoding.furniture.modal.Customer;
import com.bootcoding.furniture.utils.CityGenrator;
import com.bootcoding.furniture.utils.NameGenerator;
import com.bootcoding.furniture.utils.OfferCountGenertor;
import com.bootcoding.furniture.utils.VisitCountGenrator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    public static final int MAX = 200;

    public List<Customer>  getAllCustomer(){
        List<Customer> customers = new ArrayList<>();
        for (int i=0;i<MAX;i++){
            Customer customer = buildCustomer();
            customers.add(customer);
        }
        return customers;
    }
    private Customer buildCustomer() {
        Customer customer = new Customer();
        customer.setName(NameGenerator.getName());
        customer.setCityName(CityGenrator.getCity());
        customer.setOfferCount(OfferCountGenertor.getOfferCount());
        customer.setVisitCount(VisitCountGenrator.getOrderCount());
        return customer;
    }

}
