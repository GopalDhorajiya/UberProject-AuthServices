package com.gopal.uberprojectauthservice.Dtos;

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
}
