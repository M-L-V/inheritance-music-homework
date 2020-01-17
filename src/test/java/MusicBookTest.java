import nonInstruments.MusicBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicBookTest {

    MusicBook musicBook;

    @Before
    public void before(){
        musicBook = new MusicBook("Alan Silvestri", "The Music of the Marvel Cinematic Universe", 10.00, 20.00);
    }

    @Test
    public void hasAuthor(){
        assertEquals("Alan Silvestri", musicBook.getAuthor());
    }

    @Test
    public void hasTitle(){
        assertEquals("The Music of the Marvel Cinematic Universe", musicBook.getTitle());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(10.00, musicBook.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20.00, musicBook.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(10.00, musicBook.markUp(), 0.01);
    }
}
