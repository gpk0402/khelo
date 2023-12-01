package com.khelo.controller;

import com.khelo.Service.SignInService;
import com.khelo.dto.response.PlayerDtoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SignIn {

    @Autowired
    private SignInService signInService;
    @PostMapping("/signin")
    public ResponseEntity<PlayerDtoResponse> signIn(@RequestParam String email){
        log.info("Entered into player signin rest controller {}",email);
        return new ResponseEntity<>(signInService.signIn(email), HttpStatus.OK);
    }
}
