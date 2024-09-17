package Day10;

public abstract class LibraryMaterial {
    private String title;
    private int availabilityCount;
    private String type;

    public LibraryMaterial(String title, int availabilityCount, String type) {
        this.title = title;
        this.availabilityCount = availabilityCount;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailabilityCount() {
        return availabilityCount;
    }

    public String getType() {
        return type;
    }

    public void borrow() {
        if (availabilityCount > 0) {
            availabilityCount--;
            System.out.println("Material borrowed successfully.");
        } else {
            System.out.println("Material is not available.");
        }
    }

    public void returnMaterial() {
        availabilityCount++;
        System.out.println("Material returned successfully.");
    }
}