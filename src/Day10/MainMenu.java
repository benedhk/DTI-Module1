package Day10;

import java.util.Scanner;

public class MainMenu {
    // ... (existing methods)

    public static void borrowMaterial(Library library, User user, Scanner scanner) {
        System.out.print("Enter material title to borrow: ");
        String title = scanner.nextLine();
        LibraryMaterial material = library.findMaterial(title);
        if (material != null) {
            library.borrowMaterial(material, user);
        } else {
            System.out.println("Material not found.");
        }
    }

    public static void returnMaterial(Library library, User user, Scanner scanner) {
        System.out.print("Enter material title to return: ");
        String title = scanner.nextLine();
        LibraryMaterial material = library.findMaterial(title);
        if (material != null) {
            library.returnMaterial(material, user);
        } else {
            System.out.println("Material not found.");
        }
    }

    public static void viewHistory(User user) {
        for (Transaction transaction : user.getTransactions()) {
            System.out.println(transaction);
        }
    }
}