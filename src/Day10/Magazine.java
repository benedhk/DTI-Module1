package Day10;
public class Magazine extends LibraryMaterial {
    private String publisher;
    private int issueNumber;

    public Magazine(String title, int availabilityCount, String publisher, int issueNumber) {
        super(title, availabilityCount, "Magazine");
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine: " + super.toString() + ", Publisher: " + publisher + ", Issue Number: " + issueNumber;
    }
}