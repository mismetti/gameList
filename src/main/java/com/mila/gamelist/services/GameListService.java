package com.mila.gamelist.services;

import com.mila.gamelist.dto.GameDTO;
import com.mila.gamelist.dto.GameListDTO;
import com.mila.gamelist.dto.GameMinDTO;
import com.mila.gamelist.entities.Game;
import com.mila.gamelist.entities.GameList;
import com.mila.gamelist.repositories.GameListRepository;
import com.mila.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }


}
