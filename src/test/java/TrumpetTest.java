import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("brass", "gold", "wind", 50.50, 90.00, 8);
    }


    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("wind", trumpet.getType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(50.50, trumpet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(90.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasValveNum(){
        assertEquals(8, trumpet.getValveNum());
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", trumpet.play());
    }

}
