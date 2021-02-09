import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book dasKapital;

    @Before
    public void before() {
        dasKapital = new Book("Das Kapital", "Karl Marx", "Sci Fi", 1867);
    }

    @Test
    public void hasName() {
        assertEquals("Das Kapital", dasKapital.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Karl Marx", dasKapital.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Sci Fi", dasKapital.getGenre());
    }

    @Test
    public void hasYear() {
        assertEquals(1867, dasKapital.getYear());
    }
}

