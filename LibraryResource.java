
public interface LibraryResource {

    String getTitle();
    String getAuthor();
    double getRentalFee();
    void printResourceDetails();
    void printBorrowedBy();
    void borrowResource(Member member);
    void returnResource(Member member);

}
