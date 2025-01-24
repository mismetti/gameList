package com.mila.gamelist.repositories;

import com.mila.gamelist.entities.Game;
import com.mila.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {



}
