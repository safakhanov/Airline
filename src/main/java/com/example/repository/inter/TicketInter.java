package com.example.repository.inter;

import com.example.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketInter extends JpaRepository<Ticket,Integer> {
    Ticket findById(String s);

}
