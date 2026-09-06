package in.ashokit.service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
import org.slf4j.helpers.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookingServiceImpl implements BookingService{

    private Map<Integer, Ticket> ticketsMap = new HashMap<>();
    private Integer ticketNumber = 1;
    @Override
    public Ticket bookTicket(Passenger passenger) {
        Ticket t = new Ticket();
        BeanUtils.copyProperties(passenger, t);
        t.setTicketCost(550.00);
        t.setStatus("Confirmed");
        t.setTicketNo(ticketNumber);

        ticketsMap.put(ticketNumber, t);
        ticketNumber++;

        return t;
    }

    @Override
    public Ticket getTicket(Integer ticketNumber) {
        if(ticketsMap.containsKey(ticketNumber)) {
            return ticketsMap.get(ticketNumber);
        }
        return null;
    }
}
