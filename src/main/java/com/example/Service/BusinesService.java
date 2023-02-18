package com.example.Service;

import com.example.Entity.Passenger;
import com.example.Entity.Ticket;
import com.example.Exception.EnoughMoney;
import com.example.repository.inter.PassengerInter;
import com.example.repository.inter.TicketInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BusinesService {
    @Autowired
    TicketInter ticketInter;
    @Autowired
    PassengerInter passengerInter;

    public boolean buyTicket(Integer ticketId, Integer passengerId) throws EnoughMoney {
        boolean buyed = false;
        Ticket ticket = ticketInter.findById(ticketId).get();
        Passenger passenger = passengerInter.findById(passengerId).get();
        if (passenger.getMoney().compareTo(ticket.getDetails().getPrice())>=0){
            passenger.setMoney(passenger.getMoney().subtract(ticket.getDetails().getPrice()));
            ticket.getDetails().setAvailableSeats(ticket.getDetails().getAvailableSeats()-1);
            ticketInter.save(ticket);
            passengerInter.save(passenger);
            buyed = true;
        }
        else {
            throw new EnoughMoney("Enough your money");
        }
        return  buyed;
    }
}
