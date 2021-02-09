//import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;



//    constructor
    public Library(String name, int capacity) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public String getLibraryName() {
        return this.name;
    }

    public int booksCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(this.booksCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public void loanBook(Book book, Borrower borrower) {
        this.books.remove(book);
        borrower.borrowing.add(book);
    }
}


