//import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;

//    constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public String getLibraryName() {
        return this.name;
    }

    public int booksCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}


