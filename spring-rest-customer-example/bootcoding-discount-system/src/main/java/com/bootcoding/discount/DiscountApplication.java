package com.bootcoding.discount;

import com.bootcoding.discount.model.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DiscountApplication implements ApplicationRunner {
    @Autowired
    Marker marker;
    public static void main(String[] args) {

        SpringApplication.run(DiscountApplication.class,args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Welcome to Spring Boot App!");
        marker.setColor("Blue");
        marker.setBrand("Camlin");
        marker.setPrice(100);

        System.out.println(marker.getBrand());
        System.out.println(marker.getColor());
        System.out.println(marker.getPrice());



//        System.out.println(cycle.getBrand());
//        System.out.println(cycle.getColor());
//        System.out.println(cycle.getPrice());
//        System.out.println(cycle.getType());

    }
}
