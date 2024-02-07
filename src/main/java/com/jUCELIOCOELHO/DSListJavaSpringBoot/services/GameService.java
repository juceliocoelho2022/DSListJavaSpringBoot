package com.jUCELIOCOELHO.DSListJavaSpringBoot.services;

import java.util.List;

import com.jUCELIOCOELHO.DSListJavaSpringBoot.dto.GameDTO;
import com.jUCELIOCOELHO.DSListJavaSpringBoot.dto.GameMinDTO;
import com.jUCELIOCOELHO.DSListJavaSpringBoot.entities.Game;
import com.jUCELIOCOELHO.DSListJavaSpringBoot.projections.GameMinProjection;
import com.jUCELIOCOELHO.DSListJavaSpringBoot.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;



@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long listId) {
        Game result = gameRepository.findById(listId).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByGameList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(GameMinDTO::new).toList();
    }
}