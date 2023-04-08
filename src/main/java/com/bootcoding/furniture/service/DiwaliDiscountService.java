package com.bootcoding.furniture.service;

import com.bootcoding.furniture.modal.Customer;
import com.bootcoding.furniture.utils.CalculateDiscount;
import com.bootcoding.furniture.utils.DiscountValidityGenrator;
import com.bootcoding.furniture.utils.DiwaliDiscountCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.bootcoding.furniture.utils.ValidityDateGenrator.getValidityDate;

@Service
public class DiwaliDiscountService {
    @Autowired
    private CustomerService customerService;
    private static final int MAX_L = 200;
    private static final int VALIDITY_DAYS = 15;

    public List<CalculateDiscount> getAllCustomerDiscount(){
        List<CalculateDiscount> calculateDiscounts = new ArrayList<>();
        List<Customer> customers = customerService.getAllCustomer();
        for (int i=0;i<customers.size();i++){
            Customer customer = customers.get(i);
            CalculateDiscount customerDiscount = calculateCustomerDiscount(customer);
            calculateDiscounts.add(customerDiscount);
        }
        return calculateDiscounts;
    }

    private CalculateDiscount calculateCustomerDiscount(Customer customer) {
        CalculateDiscount calculateDiscount = new CalculateDiscount();
        calculateDiscount.setName(customer.getName());
        calculateDiscount.setValidity(DiscountValidityGenrator.getValidity(getValidityDate()));
        calculateDiscount.setDiscount(CalculateDiscount.getDiscount(customer));
        return calculateDiscount;
    }


}
