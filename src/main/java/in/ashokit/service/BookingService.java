package in.ashokit.service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

public interface BookingService {
    Ticket bookTicket(Passenger passenger);

    Ticket getTicket(Integer ticketNumber);
}
