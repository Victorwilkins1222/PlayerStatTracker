package com.postgresql.playerstattracker.repo;

import com.postgresql.playerstattracker.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//@RepositoryRestResource
public interface PlayerRepo extends JpaRepository<Player, Long> {
}
