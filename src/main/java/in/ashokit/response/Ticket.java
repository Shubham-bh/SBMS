package in.ashokit.response;

import lombok.Data;
import org.springframework.boot.context.properties.bind.Name;

@Data
public class Ticket {
    @Name("TicketNo")
    private Integer ticketNo;
    private String status;
    private Double ticketCost;
    private String name;
    private String from;
    private String to;
    private String doj;
    private String trainNumber;
}
