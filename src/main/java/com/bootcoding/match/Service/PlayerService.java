package com.bootcoding.match.Service;

import com.bootcoding.furniture.utils.NameGenerator;
import com.bootcoding.match.model.Player;
import com.bootcoding.match.utils.PlayerTypeGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlayerService {
    public ArrayList<Player> getAllPlayer(){
        ArrayList<Player> players = new ArrayList<>();
        for (int i=0;i<11;i++){
            Player player = createPlayer();
            players.add(player);
        }
        return players;
    }

    private Player createPlayer() {
        Player player = new Player();
        player.setName(NameGenerator.getName());
        player.setType(PlayerTypeGenerator.getPlayer());
        return player;
    }

}
