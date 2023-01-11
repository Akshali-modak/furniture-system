package com.bootcoding.match.controller;

import com.bootcoding.match.Service.PlayerService;
import com.bootcoding.match.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/player/{name}")
    public Player getPlayerName(@PathVariable("name") String name){

        ArrayList<Player> allPlayer = playerService.getAllPlayer();
        for(Player player : allPlayer){
            if(player.getName().equals(name)){
                return player;
            }
        }
        return null;
    }

}
