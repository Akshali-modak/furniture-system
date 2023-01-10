package com.bootcoding.match.utils;

import java.util.Random;

public class PlayerTypeGenerator {
    private static String[] typeOfPlayer =
            {"Bowler", "Batsman", "AllRounder", "WicketKeeper"};

    public static String getPlayer() {
        Random random = new Random();
        int randomIndex = random.nextInt(typeOfPlayer.length);
        return typeOfPlayer [randomIndex];
    }

    public static void main(String[] args) {

        PlayerTypeGenerator.getPlayer();
    }


}
