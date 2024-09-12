package Day8;

import java.time.LocalDate;

public class Ticket {
    private static int nextTicketId = 1;
    private int ticketId;
    private String eventName;
    private LocalDate eventDate; // Store the full date
    private double price;
    private TicketStatus status;

    public Ticket(String eventName, LocalDate eventDate) {
        this.ticketId = nextTicketId++;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.price = price;
        this.status = TicketStatus.AVAILABLE;
    }

    // Getters and setters
    public int getTicketId() {
        return ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
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
}