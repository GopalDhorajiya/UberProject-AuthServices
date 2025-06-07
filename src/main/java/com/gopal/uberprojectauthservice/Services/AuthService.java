package com.gopal.uberprojectauthservice.Services;

import com.gopal.uberprojectauthservice.Dtos.PassengerDto;
import com.gopal.uberprojectauthservice.Dtos.PassengerSignupRequestDto;

public interface AuthService {

    PassengerDto signupPassenger(PassengerSignupRequestDto passengerSignupRequestDto);
}
