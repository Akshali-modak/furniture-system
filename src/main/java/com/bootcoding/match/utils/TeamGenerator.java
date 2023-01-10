package com.bootcoding.match.utils;

import java.util.Random;

public class TeamGenerator {
    private static String[] teams =
            {"India", "Australia",};

    public static String getTeam() {
        Random random = new Random();
        int randomIndex = random.nextInt(teams.length);
        return teams [randomIndex];
    }

    public static void main(String[] args) {

       TeamGenerator.getTeam();
    }

}
