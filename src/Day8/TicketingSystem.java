package Day8;

import java.time.LocalDate;
import java.util.*;
import java.util.Scanner;
import java.util.List;

public class TicketingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Event details
        List<Event> events = new ArrayList<>();
        events.add(new Event("Concert", LocalDate.of(2024, 10, 15), new Venue("Arena", "123 Concert Street"), 100));
        // Add more events as needed

        // Customer details
        String customerName = "John Doe";
        String contactInfo = "johndoe@example.com";

        Customer customer = new Customer(customerName, contactInfo);

        // Main menu
        int choice;
        do {
            System.out.println("1. Choose event");
            System.out.println("2. Confirm booking");
            System.out.println("3. List booked tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Choose event
                    System.out.println("Available events:");
                    for (Event event : events) {
                        System.out.println(event.getEventId() + ": " + event.getName() + " - " + event.getEventDate());
                    }

                    System.out.print("Enter event ID to choose: ");
                    int eventId = scanner.nextInt();
                    scanner.nextLine();

                    Event selectedEvent = findEventById(events, eventId);
                    if (selectedEvent != null) {
                        System.out.println("Event selected: " + selectedEvent.getName());
                        System.out.println("Number of available tickets: " + selectedEvent.getAvailableTickets());

                        if (selectedEvent.getAvailableTickets() > 0) {
                            // Book a ticket
                            Ticket ticket = selectedEvent.bookTicket();
                            if (ticket != null) {
                                Booking booking = new Booking(customer, ticket);
                                customer.addBooking(booking);
                                System.out.println("Booking confirmed.");
                            } else {
                                System.out.println("No available tickets for this event.");
                            }
                        } else {
                            System.out.println("No available tickets for this event.");
                        }
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;
                case 2:
                    // Confirm booking
                    System.out.println("Your unconfirmed bookings:");
                    for (Booking booking : customer.getBookings()) {
                        if (booking.getStatus() == TicketStatus.BOOKED) {
                            System.out.println("Booking ID: " + booking.getBookingId());
                            System.out.println("Event: " + booking.getTicket().getEventName());
                        }
                    }

                    System.out.print("Enter booking ID to confirm or cancel: ");
                    int bookingId = scanner.nextInt();
                    scanner.nextLine();

                    Booking bookingToConfirm = findBookingById(customer.getBookings(), bookingId);
                    if (bookingToConfirm != null && bookingToConfirm.getStatus() == TicketStatus.BOOKED) {
                        System.out.println("Do you want to confirm (1) or cancel (2) this booking?");
                        int confirmOrCancel = scanner.nextInt();
                        scanner.nextLine();

                        if (confirmOrCancel == 1) {
                            bookingToConfirm.confirm();
                            System.out.println("Booking confirmed.");
                        } else if (confirmOrCancel == 2) {
                            bookingToConfirm.cancel();
                            System.out.println("Booking canceled.");
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    } else {
                        System.out.println("Booking not found or cannot be modified.");
                    }
                    break;
                case 3:
                    // List booked tickets
                    System.out.println("Your booked tickets:");
                    for (Booking booking : customer.getBookings()) {
                        if (booking.getStatus() == TicketStatus.CONFIRMED) { // Check for confirmed bookings
                            System.out.println("Booking ID: " + booking.getBookingId());
                            System.out.println("Event: " + booking.getTicket().getEventName());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    // Helper methods
    private static Event findEventById(List<Event> events, int eventId) {
        for (Event event : events) {
            if (event.getEventId() == eventId) {
                return event;
            }
        }
        return null;
    }

    private static Booking findBookingById(List<Booking> bookings, int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }
        return null;
    }
}