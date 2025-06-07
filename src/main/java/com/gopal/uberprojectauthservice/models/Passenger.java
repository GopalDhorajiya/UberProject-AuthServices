package com.gopal.uberprojectauthservice.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger extends BaseModel{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password; // encrypted password

    @Column(nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "passenger",fetch = FetchType.LAZY)
    private List<Booking> bookings;
}
