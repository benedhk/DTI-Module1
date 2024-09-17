package Day10;
public class Book extends LibraryMaterial {
    private String author;
    private String isbn;

    public Book(String title, int availabilityCount, String author, String isbn) {
        super(title, availabilityCount, "Book");
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() + ", Author: " + author + ", ISBN: " + isbn;
    }
}