package com.gopal.uberprojectauthservice.Dtos;

import com.gopal.uberprojectauthservice.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PassengerDto {

    private Long id;

    private String email;

    private String password; // encrypted password

    private String phoneNumber;

    private String name;

    private Date createdAt;

    public static PassengerDto from(Passenger passenger) {
        return PassengerDto.builder().email(passenger.getEmail())
                .password(passenger.getPassword())
                .phoneNumber(passenger.getPhoneNumber())
                .id(passenger.getId())
                .name(passenger.getName())
                .createdAt(passenger.getCreatedAt())
                .build();
    }
}
