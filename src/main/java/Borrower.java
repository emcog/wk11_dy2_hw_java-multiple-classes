import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowing;

//    constructor
    public Borrower() {
        this.borrowing = new ArrayList<Book>();
    }

    public int borrowCount() {
        return borrowing.size();
    }
}
