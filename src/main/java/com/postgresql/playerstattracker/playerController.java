package com.postgresql.playerstattracker;

import com.postgresql.playerstattracker.model.Player;
import com.postgresql.playerstattracker.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class playerController {

    @Autowired
    PlayerRepo repo;

    @PostMapping("/addPlayer")
    public void addPlayer(@RequestBody Player player) {
        repo.save(player);

    }
}
