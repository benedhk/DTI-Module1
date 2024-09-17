package Day10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        User currentUser = null;

        // Add initial materials
        library.addMaterial(new Book("Atomic Habits", 2, "James Clear", "9780735283205"));
        library.addMaterial(new DVD("Inception", 1, 2010, "PG-13"));
        library.addMaterial(new Magazine("National Geographic", 5, "National Geographic Society", 123));

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    currentUser = LoginRegister.registerUser(library, scanner);
                    if (currentUser != null) {
                        System.out.println("User registered successfully.");
                    }
                    break;
                case 2:
                    currentUser = LoginRegister.loginUser(library, scanner);
                    if (currentUser != null) {
                        System.out.println("Login successful.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }

            if (currentUser != null) {
                MainMenu.showMenu();
                choice = MainMenu.getChoice(scanner);

                switch (choice) {
                    case 1:
                        MainMenu.borrowMaterial(library, currentUser, scanner);
                        break;
                    case 2:
                        MainMenu.returnMaterial(library, currentUser, scanner);
                        break;
                    case 3:
                        MainMenu.viewHistory(currentUser);
                        break;
                    case 4:
                        break; // Exit the menu
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}