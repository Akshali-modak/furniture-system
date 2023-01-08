package com.bootcoding.furniture.utils;

import com.bootcoding.furniture.modal.Customer;

import javax.xml.crypto.Data;
import java.util.Date;

public class CalculateDiscount {
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDiscount(Customer customer) {
        return discount;
    }

    public void setDiscount(int discount) {

        this.discount = discount;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {

        this.validity = validity;
    }

    private static int discount;
    private Date validity;
}
