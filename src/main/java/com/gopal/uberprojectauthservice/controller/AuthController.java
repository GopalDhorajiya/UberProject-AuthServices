package com.gopal.uberprojectauthservice.controller;

import com.gopal.uberprojectauthservice.Dtos.PassengerSignupRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("uber/v1/auth")
public class AuthController {

    @PostMapping("/passenger")
    public ResponseEntity<?> signUp(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto)
    {
        System.out.println(passengerSignupRequestDto);
        return ResponseEntity.ok("Good");
    }
}
