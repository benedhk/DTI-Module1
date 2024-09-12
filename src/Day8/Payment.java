package Day8;

public class Payment {
    private static int nextPaymentId = 1;
    private int paymentId;
    private Booking booking;
    private double amount;
    private PaymentMethod paymentMethod;

    public Payment(Booking booking) {
        this.paymentId = nextPaymentId++;
        this.booking = booking;
        this.amount = booking.getTicket().getPrice();
        // Set the payment method to a default value
        this.paymentMethod = PaymentMethod.CREDIT_CARD; // Or choose another default
    }

    // Getters and setters
    public int getPaymentId() {
        return paymentId;
    }

    public Booking getBooking() {
        return booking;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}