package Day10;

import java.util.Scanner;

public class MainMenu {
    public static void showMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Borrow Material");
        System.out.println("2. Return Material");
        System.out.println("3. View History");
        System.out.println("4. Exit");
    }

    public static int getChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

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
        System.out.println("Your borrowing history:");
        for (Transaction transaction : user.getTransactions()) {
            System.out.println(transaction);
        }
    }
}