package Day10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryMaterial> materials;
    private List<User> users;

    public Library() {
        materials = new ArrayList<>();
        users = new ArrayList<>();

        // Add some initial materials
        materials.add(new Book("The Great Gatsby", 2, "F. Scott Fitzgerald", "9780743273563"));
        materials.add(new DVD("Inception", 1, 2010, "PG-13"));
        materials.add(new Magazine("National Geographic", 5, "National Geographic Society", 123));
    }


    public LibraryMaterial findMaterial(String title) {
        for (LibraryMaterial material : materials) {
            if (material.getTitle().equals(title)) {
                return material;
            }
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully."); // Optional confirmation message
    }

    public User findUser(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void addMaterial(LibraryMaterial material) {
        materials.add(material);
    }

    public void borrowMaterial(LibraryMaterial material, User user) {
        if (material.getAvailabilityCount() > 0) {
            material.borrow();
            user.borrowMaterial(material);
        } else {
            System.out.println("Material is not available.");
        }
    }

    public void returnMaterial(LibraryMaterial material, User user) {
        material.returnMaterial();
        user.returnMaterial(material);
    }
}