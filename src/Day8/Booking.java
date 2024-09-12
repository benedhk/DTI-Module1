package Day8;
public class Booking {
    private static int nextBookingId = 1;
    private int bookingId;
    private Customer customer;
    private Ticket ticket;
    private BookingStatus status;

    public Booking(Customer customer, Ticket ticket) {
        this.bookingId = nextBookingId++;
        this.customer = customer;
        this.ticket = ticket;
        this.status = BookingStatus.BOOKED; // Set initial status to BOOKED
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

    public BookingStatus getStatus() {
        return status;
    }

    public void confirm() {
        if (ticket.getStatus() == TicketStatus.AVAILABLE) {
            this.status = BookingStatus.CONFIRMED;
            // ... (send confirmation email, etc.)
        } else {
            System.out.println("Ticket is not available.");
        }
    }

    public void cancel() {
        if (status == BookingStatus.BOOKED) {
            this.status = BookingStatus.CANCELED;
            // ... (send cancellation notification, etc.)
        } else {
            System.out.println("Booking cannot be canceled. Ticket is not booked.");
        }
    }
}