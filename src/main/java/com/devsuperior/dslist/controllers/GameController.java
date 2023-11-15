package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // informado que essa classe é um controlador
@RequestMapping(value = "/games")// configurando o caminho a ser respondido pela API
public class GameController {

    @Autowired // injeção do service
    private GameService gameService;
    @GetMapping// metodo get do HTTP
    public List<GameMinDto> findAll(){
       return gameService.findAll();

    }



}
