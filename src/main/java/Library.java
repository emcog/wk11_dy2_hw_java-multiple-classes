import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;

//    constructor
    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int countBooks() {
        return books.size();
    }
}


