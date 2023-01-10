package com.bootcoding.match.Service;

import com.bootcoding.match.utils.IDGenrator;
import com.bootcoding.match.model.Match;
import com.bootcoding.match.utils.MatchDateGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    @Autowired
    TeamService teamService;

    public Match createMatch() {
      Match match = new Match();
      match.setId(IDGenrator.getId());
      match.setTeams(teamService.createTeam());
      match.setWinnerTeam(match.getWinnerTeam());
      match.setMatchDate(MatchDateGenerator.getMatchDate(12));
      return match;
    }

}
