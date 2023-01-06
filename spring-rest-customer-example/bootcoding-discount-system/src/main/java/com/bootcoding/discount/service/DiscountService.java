package com.bootcoding.discount.service;

import com.bootcoding.discount.model.CalculateDiscount;
import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.bootcoding.discount.utils.ValidityDateGenrator.getValidityDate;

@Service
public class DiscountService {
    @Autowired
    private CustomerService customerService;
    private static final int MAX_LIMIT = 100;
    private static final int VALIDITY_DAYS = 10;

    public List<CalculateDiscount> getAllCustomerDiscount(){
        List<CalculateDiscount> customerDiscounts = new ArrayList<>();
        List<Customer> customers = customerService.getAllCustomer();
        for (int i=0;i<customers.size();i++){
            Customer customer = customers.get(i);
            CalculateDiscount customerDiscount = calculateCustomerDiscount(customer);
            customerDiscounts.add(customerDiscount);
        }
        return customerDiscounts;
    }
    private CalculateDiscount calculateCustomerDiscount(Customer customer) {
        CalculateDiscount calculateDiscount = new CalculateDiscount();
        calculateDiscount.setName(customer.getName());
        calculateDiscount.setValidity(DiscountValidityGenrator.getValidity(getValidityDate()));
        calculateDiscount.setDiscount(DiscountCalculator.getDiscount(customer));
        return calculateDiscount;
    }

}
