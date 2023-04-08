package com.bootcoding.match.controller;

import com.bootcoding.match.Service.PlayerService;
import com.bootcoding.match.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/addPlayer")
    public Player createPlayer(@RequestBody Player addPlayer){
        playerService.getAllPlayer();
        return addPlayer;
    }
    @DeleteMapping("/player/{name}")
    public ArrayList<Player> deleteName(@PathVariable("name")String name){
        playerService.getAllPlayer();
          return null;
    }

}
