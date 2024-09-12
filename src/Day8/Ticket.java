package Day8;

import java.util.ArrayList;

public class Ticket {
    private static int nextTicketId = 1;
    private int ticketId;
    private Event event;
    private double price;
    private TicketStatus status;

    public Ticket(Event event, double price) {
        this.ticketId = nextTicketId++;
        this.event = event;
        this.price = price;
        this.status = TicketStatus.AVAILABLE;

    }

    // Getters and setters
    public int getTicketId() {
        return ticketId;
    }

    public Event getEvent() {
        return event;
    }

    public double getPrice() {
        return price;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public String getEventName() {
        return "";
    }
}