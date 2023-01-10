package com.bootcoding.match.model;

import java.util.ArrayList;

public class Team {
 private String teamName;
 private ArrayList<Player> players;

 public String getTeamName() {
  return teamName;
 }

 public void setTeamName(String teamName) {
  this.teamName = teamName;
 }

 public ArrayList<Player> getPlayers() {
  return players;
 }

 public void setPlayers(ArrayList<Player> players) {
  this.players = players;
 }
}
