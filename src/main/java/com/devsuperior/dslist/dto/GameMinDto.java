package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDto {

    private long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    // constructor with no fields

    public GameMinDto(){

    }

    // constructor with fields


    public GameMinDto(Game entity) { // instancia do Game
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    // no DTO precisamos apenas utilzar os getters , pois se trata de um objeto que estará recendo campos de outro objeto
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
