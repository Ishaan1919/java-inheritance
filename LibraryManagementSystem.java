class Book{
    private String title;
    private String publicationYear;

    Book(String title, String year){
        this.title = title;
        this.publicationYear = year;
    }

    void displayInfo(){
        System.out.println("Title : " + this.title);
        System.out.println("Year of publication : " + this.publicationYear);
    }
}

class Author extends Book{
    private String name;
    private String bio;

    Author(String name, String bio, String title, String year){
        super(title,year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author name: " + this.name);
        System.out.println("Author bio: " + this.bio);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author = new Author("Ishaan","My Coding experience in the training", "Coding Master class","2025");
        author.displayInfo();
    }
}

//Title : Coding Master class
//Year of publication : 2025
//Author name: Ishaan
//Author bio: My Coding experience in the training
