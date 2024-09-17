package Day10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryMaterial> materials;
    private List<User> users;

    public Library() {
        materials = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addMaterial(LibraryMaterial material) {
        materials.add(material);
    }

    public LibraryMaterial findMaterial(String title) {
        for (LibraryMaterial material : materials) {
            if (material.getTitle().equals(title)) {
                return material;
            }
        }
        return null;
    }

    public User findUser(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
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