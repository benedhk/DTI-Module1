package Day8;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int nextCustomerId = 1;
    private int customerId;
    private String name;
    private String contactInformation;
    private List<Booking> bookings;

    public Customer(String name, String contactInformation) {
        this.customerId = nextCustomerId++;
        this.name = name;
        this.contactInformation = contactInformation;
        this.bookings = new ArrayList<>();
    }

    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
}