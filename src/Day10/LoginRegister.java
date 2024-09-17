package Day10;

import java.util.Scanner;

public class LoginRegister {
    public static User registerUser(Library library, Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if user already exists
        if (library.findUser(id) != null) {
            System.out.println("User already exists.");
            return null;
        }

        // Create new user
        User user = new User(name, id, password);
        library.addUser(user);
        System.out.println("User registered successfully.");
        return user;
    }

    public static User loginUser(Library library, Scanner scanner) {
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = library.findUser(id);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful.");
            return user;
        } else {
            System.out.println("Invalid ID or password.");
            return null;
        }
    }
}