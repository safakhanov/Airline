package com.example.Entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Embeddable
public class Details {
    private BigDecimal price;
    private Integer totalSeats;
    private Integer availableSeats;
    private LocalDate departureDate;
}
