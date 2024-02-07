package com.jUCELIOCOELHO.DSListJavaSpringBoot.dto;


import com.jUCELIOCOELHO.DSListJavaSpringBoot.entities.Game;
import com.jUCELIOCOELHO.DSListJavaSpringBoot.projections.GameMinProjection;
import lombok.Getter;

@Getter
public class GameMinDTO {

    private final Long id;
    private final String title;
    private final Integer year;
    private final String imgUrl;
    private final String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

}
