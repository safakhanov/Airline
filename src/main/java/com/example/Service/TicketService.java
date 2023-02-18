package com.example.Service;

import com.example.Entity.Passenger;
import com.example.Entity.Ticket;
import com.example.repository.inter.TicketInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TicketService {
    TicketInter ticketInter ;

    @Autowired
    public TicketService(TicketInter ticketInter){
        this.ticketInter = ticketInter;
    }
    public Ticket findbyId(Integer id){
            Ticket ticket = ticketInter.findById(id).get();
        return ticket;
    }


}
