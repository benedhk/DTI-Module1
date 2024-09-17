package Day10;

public class DVD extends LibraryMaterial {
    private int releaseYear;
    private String rating;

    public DVD(String title, int availabilityCount, int releaseYear, String rating) {
        super(title, availabilityCount, "DVD");
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "DVD: " + super.toString() + ", Release Year: " + releaseYear + ", Rating: " + rating;
    }
}