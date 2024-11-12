package com.teste.dslist.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.dslist.dto.GameMiniDTO;
import com.teste.dslist.entities.Game;
import com.teste.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController { 

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMiniDTO> finList(){
        List<GameMiniDTO> result = gameService.findAll();
        return result;
    }

}
