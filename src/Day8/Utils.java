package Day8;

import java.util.List;

public class Utils {
    public static Booking findBookingById(List<Booking> bookings, int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }
        return null;
    }
}