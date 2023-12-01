package com.khelo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.khelo.entity.Player;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String>{
    Optional<Player> findByEmail(String email);
    boolean existsById(String id);
    @Query()
    Player getById(String id);
}
