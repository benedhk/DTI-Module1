package Day9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class ToDoListApp {
    private ArrayList<User> users;

    public ToDoListApp() {
        this.users = new ArrayList<>();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

    private void registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Create a new user and add it to the list
        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("User created successfully!");
    }

    private void loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Find the user in the list
        User loggedInUser = null;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                break;
            }
        }

        if (loggedInUser != null) {
            System.out.println("Login successful!");
            displayUserMenu(loggedInUser, scanner);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void displayUserMenu(User user, Scanner scanner) {
        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Delete task");
            System.out.println("4. Log out");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addTask(user, scanner);
                    break;
                case 2:
                    viewTasks(user);
                    break;
                case 3:
                    deleteTask(user, scanner);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addTask(User user, Scanner scanner) {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(description);
        user.addTask(task);
        System.out.println("Task added successfully!");
    }

    private void viewTasks(User user) {
        if (user.getTasks().isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Your tasks:");
            for (Task task : user.getTasks()) {
                System.out.println("- ID: " + task.getId() + " - Description: " + task.getDescription());
            }
        }
    }

    private void deleteTask(User user, Scanner scanner) {
        System.out.print("Enter task ID to delete: ");
        String taskIdString = scanner.nextLine();
        UUID taskId = UUID.fromString(taskIdString);

        boolean taskDeleted = false;
        for (Task task : user.getTasks()) {
            if (task.getId().equals(taskId)) {
                user.removeTask(task);
                taskDeleted = true;
                break;
            }
        }

        if (taskDeleted) {
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }
}