package com.example.repository.inter;

import com.example.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInter extends JpaRepository<Passenger,Integer> {
    Passenger findById(String s);
    Passenger findByUsername(String s);

}
