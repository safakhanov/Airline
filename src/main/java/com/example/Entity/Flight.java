package com.example.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String airlineName;
    private String fromLocation;
    private String toLocation;
    private LocalTime arrivelTime;
    private LocalTime departureTime;
    @Embedded
    private Details details;
}
