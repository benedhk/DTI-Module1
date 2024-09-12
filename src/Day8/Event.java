package Day8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private static int nextEventId = 1;
    private int eventId;
    private String name;
    private LocalDate eventDate;
    private Venue venue;
    private int totalTickets;
    private int availableTickets;
    private double ticketPrice;
    private List<Ticket> tickets;

    public Event(String name, LocalDate eventDate, Venue venue, int totalTickets, double ticketPrice) {
        this.eventId = nextEventId++;
        this.name = name;
        this.eventDate = eventDate;
        this.venue = venue;
        this.totalTickets = totalTickets;
        this.availableTickets = totalTickets;
        this.ticketPrice = ticketPrice;
        this.tickets = new ArrayList<>(); // Initialize the tickets list
    }

    // Getters and setters
    public int getEventId() {
        return eventId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public Ticket bookTicket() {
        if (availableTickets > 0) {
            availableTickets--;
            Ticket ticket = new Ticket(this, ticketPrice);
            tickets.add(ticket); // Add the ticket to the event's list
            return ticket;
        } else {
            System.out.println("No available tickets for this event.");
            return null;
        }
    }
}