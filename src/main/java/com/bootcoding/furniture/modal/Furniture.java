package com.bootcoding.furniture.modal;

import org.springframework.stereotype.Component;

@Component
public class Furniture {
    private String products;

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }
}
