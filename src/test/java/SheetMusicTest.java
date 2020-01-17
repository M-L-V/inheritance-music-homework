import nonInstruments.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Mr Blue Sky", "Electric Light Orchestra", 5.50, 10.50);
    }

    @Test
    public void hasPiece(){
        assertEquals("Mr Blue Sky", sheetMusic.getPiece());
    }

    @Test
    public void hasTitle(){
        assertEquals("Electric Light Orchestra", sheetMusic.getArtist());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5.50, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.50, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(5.00, sheetMusic.markUp(), 0.01);
    }

}
