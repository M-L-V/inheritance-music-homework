import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("metal", "purple", "string", 100.00, 200.00, true);
    }

    @Test
    public void hasMaterial(){
        assertEquals("metal", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("purple", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("string", guitar.getType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(100.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(200.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasElectricStatus(){
        assertEquals(true, guitar.getElectric());
    }

    @Test
    public void canPlay(){
        assertEquals("Smoke on the water...", guitar.play());
    }
}
