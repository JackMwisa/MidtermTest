import java.util.ArrayList;

public class FictionMagazine extends Magazine{

    public FictionMagazine(String title, String author, Double rentalFee, String type, ArrayList<String> listOfMembers, ArrayList<String> listOfMagazines) {
        super(title, author, rentalFee, type, listOfMembers, listOfMagazines);
    }

    @Override
    public void printResourceDetails() {
        super.printResourceDetails();
    }
}
