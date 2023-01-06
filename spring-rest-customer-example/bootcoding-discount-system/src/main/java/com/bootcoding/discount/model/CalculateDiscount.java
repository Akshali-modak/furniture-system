package com.bootcoding.discount.model;

import java.util.Date;

public class CalculateDiscount {
    private String name;
    private int discount;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Date Validity;

    public Date getValidity() {
        return Validity;
    }

    public void setValidity(Date validity) {
        Validity = validity;
    }
}
