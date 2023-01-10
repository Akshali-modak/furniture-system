package com.bootcoding.match.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Component
public class Match {

      private ArrayList<Team> teams;
      private int id;
      private String winnerTeam;
      private Date Date;

      public Date getMatchDate() {
            return Date;
      }

      public void setMatchDate(Date matchDate) {
            this.Date = matchDate;
      }

      public ArrayList<Team> getTeams() {

          return teams;
      }

      public void setTeams(ArrayList<Team> teams) {

          this.teams = teams;
      }

      public int getId() {
            return id;
      }

      public void setId(int id) {

            this.id = id;
      }

      public String getWinnerTeam() {

            return winnerTeam;
      }

      public void setWinnerTeam(String winnerTeam) {

            this.winnerTeam = winnerTeam;
      }
}
