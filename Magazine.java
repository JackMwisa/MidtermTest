import java.util.ArrayList;

public abstract class Magazine implements LibraryResource {
    String title;
    String author;
    Double rentalFee;
    String type;
    ArrayList<String> listOfMembers;
    ArrayList<String> listOfMagazines;


    public Magazine(String title, String author, Double rentalFee, String type) {
        this.title = title;
        this.author = author;
        this.rentalFee = rentalFee;
        this.type = type;
        this.listOfMembers = listOfMembers;
        this.listOfMagazines = listOfMagazines;
    }

    @Override
    public String getTitle() {
        return "The title is: " + title;
    }

    @Override
    public String getAuthor() {
        return "The Author is: " + author;
    }

    @Override
    public double getRentalFee() {
        return rentalFee;
    }

    @Override
    public void printResourceDetails() {
        System.out.println("Title: " + title + "Author: " + author + "Rental Fee " + rentalFee);
    }

    @Override
    public void printBorrowedBy() {
        for (String members: listOfMagazines) {
            System.out.println("Magazine: " + members);
        }
    }

    @Override
    public void borrowResource(Member member) {
        System.out.println(member.getName() + " borrowed one Magazine");
    }

    @Override
    public void returnResource(Member member) {
        System.out.println(member.getName() + " returned one Magazine");
    }
}
