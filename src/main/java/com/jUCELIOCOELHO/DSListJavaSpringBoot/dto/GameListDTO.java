package com.jUCELIOCOELHO.DSListJavaSpringBoot.dto;


import com.jUCELIOCOELHO.DSListJavaSpringBoot.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
