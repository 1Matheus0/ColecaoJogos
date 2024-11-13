package com.teste.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.teste.dslist.dto.GameDTO;
import com.teste.dslist.dto.GameMiniDTO;
import com.teste.dslist.entities.Game;
import com.teste.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findByid(@PathVariable Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
        
    }
    @Transactional(readOnly = true)
    public List<GameMiniDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMiniDTO(x)).toList();
    }
}
