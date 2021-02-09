import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book dasKapital;

    Borrower borrower;

    @Before
    public void before(){
        library = new Library("Gym", 2);
        dasKapital = new Book("Das Kapital", "Karl Marx", "Sci Fi", 1867);
    }

    @Test
    public void hasName() {
        assertEquals("Gym", library.getLibraryName());
    }


    @Test
    public void startsEmpty() {
        assertEquals( 0, library.booksCount() );
    }

    @Test
    public void canAddBook() {
        library.addBook(dasKapital);
        assertEquals(1, library.booksCount());
    }

    @Test
    public void cantExceedCapacity() {
        library.addBook(dasKapital);
        library.addBook(dasKapital);
        library.addBook(dasKapital);
        assertEquals(2, library.booksCount());
    }

    @Test
    public void canLoan() {
        library.loanBook(dasKapital);
        assertEquals(1, borrower.borrowCount());
    }
}