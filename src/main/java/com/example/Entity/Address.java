package com.example.Entity;

import lombok.*;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Embeddable
public class Address {
    private String county;
    private String city;
    private String street;
    private String home;
}
