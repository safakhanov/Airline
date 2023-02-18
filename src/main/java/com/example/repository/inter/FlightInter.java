package com.example.repository.inter;

import com.example.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightInter extends JpaRepository<Flight,Integer> {
    Flight findById(String s);


}
