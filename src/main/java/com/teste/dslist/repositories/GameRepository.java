package com.teste.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    

}
