package Day8;

import java.time.LocalDate;

public class Event {
    private static int nextEventId = 1;
    private int eventId;
    private String name;
    private LocalDate eventDate;
    private Venue venue;
    private int totalTickets;
    private int availableTickets;

    public Event(String name, LocalDate eventDate, Venue venue, int totalTickets) {
        this.eventId = nextEventId++;
        this.name = name;
        this.eventDate = eventDate;
        this.venue = venue;
        this.totalTickets = totalTickets;
        this.availableTickets = totalTickets;
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

    public Venue getVenue() {
        return venue;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public Ticket bookTicket() {
        if (availableTickets > 0) {
            availableTickets--;
            Ticket ticket = new Ticket(this.name, this.eventDate);
            // No need to set eventId in Ticket
            return ticket;
        } else {
            System.out.println("No available tickets for this event.");
            return null;
        }
    }
}