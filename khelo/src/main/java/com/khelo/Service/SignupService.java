package com.khelo.Service;

import com.khelo.dto.request.PlayerDtoRequest;
import com.khelo.dto.response.PlayerDtoResponse;
import com.khelo.entity.Player;

public interface SignupService {
	public PlayerDtoResponse addPlayer(PlayerDtoRequest playerDtoRequest);

}
