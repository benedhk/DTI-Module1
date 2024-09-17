package Day10;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;
    private String password;
    private List<LibraryMaterial> borrowedMaterials;
    private List<Double> fines;
    private List<Transaction> transactions;

    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.borrowedMaterials = new ArrayList<>();
        this.fines = new ArrayList<>();
    }
    public List<Transaction> getTransactions() {
        return transactions; // Assuming you have a List<Transaction> attribute called 'transactions'
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LibraryMaterial> getBorrowedMaterials() {
        return borrowedMaterials;
    }

    public void setBorrowedMaterials(List<LibraryMaterial> borrowedMaterials) {
        this.borrowedMaterials = borrowedMaterials;
    }

    public List<Double> getFines() {
        return fines;
    }

    public void setFines(List<Double> fines) {
        this.fines = fines;
    }

    public void addFine(double amount) {
        fines.add(amount);
    }

    public void clearFines() {
        fines.clear();
    }

    public double getTotalFines() {
        double total = 0;
        for (double fine : fines) {
            total += fine;
        }
        return total;
    }

    public void borrowMaterial(LibraryMaterial material) {
        borrowedMaterials.add(material);
    }

    public void returnMaterial(LibraryMaterial material) {
        borrowedMaterials.remove(material);
    }
}