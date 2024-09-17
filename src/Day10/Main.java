package Day10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    User newUser = LoginRegister.registerUser(library, scanner);
                    if (newUser != null) {
                        currentUser = newUser;
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