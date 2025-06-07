package com.gopal.uberprojectauthservice.controller;

import com.gopal.uberprojectauthservice.Dtos.PassengerDto;
import com.gopal.uberprojectauthservice.Dtos.PassengerSignupRequestDto;
import com.gopal.uberprojectauthservice.Services.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("uber/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup/passenger")
    public ResponseEntity<?> signUp(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto)
    {

        System.out.println(passengerSignupRequestDto);
        PassengerDto passengerDto = authService.signupPassenger(passengerSignupRequestDto);
        return new ResponseEntity<>(passengerDto, HttpStatus.CREATED);
    }

    @PostMapping("/singin/passenger")
    public ResponseEntity<?> signinPassenger()
    {
        return null;
    }
}
