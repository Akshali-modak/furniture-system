package com.bootcoding.match.Service;

import com.bootcoding.match.model.Team;
import com.bootcoding.match.utils.TeamGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeamService {

   @Autowired
    PlayerService playerService;

    public ArrayList<Team> createTeam(){
        ArrayList<Team> teams = new ArrayList<>();
        for (int i=0;i<2;i++){
            Team team = buildTeam();
            teams.add(team);
        }
        return teams;
    }

    private Team buildTeam() {
        Team team = new Team();
        team.setTeamName(TeamGenerator.getTeam());
        team.setPlayers(playerService.getAllPlayer());
        return team;
    }

}
