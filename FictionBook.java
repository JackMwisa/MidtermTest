import java.util.ArrayList;

public class FictionBook extends Book{

    public FictionBook(String title, String author, Double rentalFee, String type, ArrayList<String> listOfMembers, ArrayList<String> listOfBooks) {
        super(title, author, rentalFee, type, listOfMembers, listOfBooks);
    }

    @Override
    public void printResourceDetails() {
        super.printResourceDetails();
    }
}
