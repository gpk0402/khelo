package com.khelo.Service;

import com.khelo.dto.response.PlayerDtoResponse;
import com.khelo.entity.Player;
import com.khelo.exception.PlayerException;
import com.khelo.repository.PlayerRepository;
import com.khelo.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private Mapper mapper;
    @Override
    public PlayerDtoResponse signIn(String email) {
        Player player = playerRepository.findByEmail(email).orElseThrow(()-> new PlayerException("Player Exception: Player with email not found "+email));
        return mapper.asPlayerDtoResponse(player);
    }
}
