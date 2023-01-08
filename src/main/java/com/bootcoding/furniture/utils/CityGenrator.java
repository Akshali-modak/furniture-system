package com.bootcoding.furniture.utils;

import java.util.Random;

public class CityGenrator {
    private static String[] cities =
            {"nagpur", "Bhopal", "Delhi", "Pune"};

    public static String getCity() {
        Random random = new Random();
        int randomIndex = random.nextInt(cities.length);
        return cities [randomIndex];
    }

    public static void main(String[] args) {

        CityGenrator.getCity();
    }


}
