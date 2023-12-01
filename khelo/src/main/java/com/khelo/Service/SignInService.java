package com.khelo.Service;

import com.khelo.dto.response.PlayerDtoResponse;

public interface SignInService {
    public PlayerDtoResponse signIn(String email);
}
