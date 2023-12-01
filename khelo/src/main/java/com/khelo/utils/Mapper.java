package com.khelo.utils;

import com.khelo.dto.response.PlayerDtoResponse;
import com.khelo.entity.Player;
import org.springframework.stereotype.Service;

import com.khelo.dto.request.PlayerDtoRequest;

import java.util.HashMap;

@Service
public class Mapper {

    public Player asPlayer(PlayerDtoRequest playerDto){
        return Player.builder().name(new HashMap<String, String>(){{
            put("firstName", playerDto.getFirstName());
            put("secondName", playerDto.getMiddleName());
            put("lastName", playerDto.getLastName());
        }}).email(playerDto.getEmail()).phoneNumber(playerDto.getPhoneNumber())
                .build();
    }

    public PlayerDtoResponse asPlayerDtoResponse(Player player){
        return PlayerDtoResponse.builder()
                .firstName(player.getName().get("firstName"))
                .middleName(player.getName().get("middleName"))
                .lastName(player.getName().get("lastName"))
                .dateOfBirth(player.getDateOfBirth())
                .phoneNumber(player.getPhoneNumber())
                .gender(player.getGender())
                .build();
    }
}
