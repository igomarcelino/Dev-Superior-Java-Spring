package com.devsuperior.dslist.service;


import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // componente de serivço
public class GameService {

    @Autowired
    private
    GameRepository gameRepository;

    public List<Game> findAll(){
        return gameRepository.findAll();
    }

}
