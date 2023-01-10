package com.bootcoding.match.controller;

import com.bootcoding.match.Service.MatchService;
import com.bootcoding.match.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {
    @Autowired
    MatchService matchService;
    @GetMapping("/match")
    public Match createMatch(){
        return matchService.createMatch();
    }
}
