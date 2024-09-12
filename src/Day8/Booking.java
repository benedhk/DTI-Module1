package Day8;
public class Booking {
    private static int nextBookingId = 1;
    private int bookingId;
    private Customer customer;
    private Ticket ticket;
    private TicketStatus status;

    public Booking(Customer customer, Ticket ticket) {
        this.bookingId = nextBookingId++;
        this.customer = customer;
        this.ticket = ticket;
        this.status = TicketStatus.BOOKED; // Set initial status to BOOKED
    }

    // Getters and setters
    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void confirm() {
        if (ticket.getStatus() == TicketStatus.AVAILABLE) {
            ticket.setStatus(TicketStatus.CONFIRMED);
            this.status = TicketStatus.CONFIRMED;
            // ... (send confirmation email, etc.)
        } else {
            System.out.println("Ticket is not available.");
        }
    }

    public void cancel() {
        if (ticket.getStatus() == TicketStatus.BOOKED) {
            ticket.setStatus(TicketStatus.AVAILABLE);
            this.status = TicketStatus.CANCELED;
            // ... (send cancellation notification, etc.)
        } else {
            System.out.println("Booking cannot be canceled. Ticket is not booked.");
        }
    }
}