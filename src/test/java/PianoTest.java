import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {


    Piano piano;

    @Before
    public void before(){
        piano = new Piano("oak", "black", "percussion",200.00, 500.00, "Bechstein");
    }


    @Test
    public void hasMaterial(){
        assertEquals("oak", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("percussion", piano.getType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(200.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(500.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBrand(){
        assertEquals("Bechstein", piano.getBrand());
    }

    @Test
    public void canPlay(){
        assertEquals("the sound of the Black Parade...", piano.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(300.00, piano.markUp(), 0.01);
    }
}
