package com.gopal.uberprojectauthservice.Services;


import com.gopal.uberprojectauthservice.Dtos.PassengerDto;
import com.gopal.uberprojectauthservice.Dtos.PassengerSignupRequestDto;
import com.gopal.uberprojectauthservice.models.Passenger;
import com.gopal.uberprojectauthservice.repository.PassengerRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    private final PassengerRepository passengerRepository;

    public AuthServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public PassengerDto signupPassenger(PassengerSignupRequestDto passengerSignupRequestDto) {
        Passenger passenger= Passenger.builder().email(passengerSignupRequestDto.getEmail())
                .name(passengerSignupRequestDto.getName())
                .password(passengerSignupRequestDto.getPassword())
                .phoneNumber(passengerSignupRequestDto.getPhoneNumber())
                .build();
        passenger = passengerRepository.save(passenger);
        return PassengerDto.from(passenger);
    }
}
