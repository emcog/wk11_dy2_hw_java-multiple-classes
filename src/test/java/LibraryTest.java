import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;


    @Before
    public void before(){
        library = new Library("Gym");
        book = new Book("Das Kapital", "Karl Marx", "Sci Fi", 1867);
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
        library.addBook(book);
        assertEquals(1, library.booksCount());
    }
}