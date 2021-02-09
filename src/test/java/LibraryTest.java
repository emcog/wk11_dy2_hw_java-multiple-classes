import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;


    @Before
    public void before(){
        library = new Library("Gym");
    }

    @Test
    public void hasName() {
        assertEquals("Gym", library.getName());
    }


    @Test
    public void hasBooks() {
        assertEquals( 0, library.countBooks() );
    }

}
