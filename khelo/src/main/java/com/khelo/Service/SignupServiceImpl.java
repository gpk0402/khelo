package com.khelo.Service;

import com.khelo.dto.request.PlayerDtoRequest;
import com.khelo.dto.response.PlayerDtoResponse;
import com.khelo.entity.ReferralData;
import com.khelo.exception.PlayerException;
import com.khelo.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.khelo.entity.Player;
import com.khelo.repository.PlayerRepository;

import java.util.Optional;

@Service
public class SignupServiceImpl implements SignupService {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private Mapper mapper;

	@Override
	public PlayerDtoResponse addPlayer(PlayerDtoRequest playerDtoRequest) {
		if(playerDtoRequest.getReferralId().isEmpty() || isReferralExists(playerDtoRequest.getReferralId())) {
			Player player = mapper.asPlayer(playerDtoRequest);
			Player savedPlayer = playerRepository.save(player);
//			ReferralData referralData = ReferralData.builder()
//					.referredBy(playerRepository.findById(playerDtoRequest.getReferralId()).orElse(null))
//					.build();
			return mapper.asPlayerDtoResponse(savedPlayer);
		}
		else {
			throw new PlayerException("Referral id not found", HttpStatus.NOT_FOUND);
		}

	}

	public boolean isReferralExists(String id){
		return playerRepository.existsById(id);
	}
}
