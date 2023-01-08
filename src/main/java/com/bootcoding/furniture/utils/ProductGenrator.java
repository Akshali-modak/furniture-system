package com.bootcoding.furniture.utils;

import java.util.Random;

public class ProductGenrator {
    private static String[] products =
            {"SofaSet", "StudyTable", "DiningTable", "Table"};

    public static String getProducts() {
        Random random = new Random();
        int randomIndex = random.nextInt(products.length);
        return products [randomIndex];
    }

    public static void main(String[] args) {

       ProductGenrator.getProducts();
    }

}
