package Day10;

import java.time.LocalDate;

public class Transaction {
    private LibraryMaterial material;
    private User user;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Transaction(LibraryMaterial material, User user, LocalDate borrowDate) {
        this.material = material;
        this.user = user;
        this.borrowDate = borrowDate;
    }

    public LibraryMaterial getMaterial() {
        return material;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "material=" + material +
                ", user=" + user +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}