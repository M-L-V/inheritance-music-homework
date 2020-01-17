import instruments.Guitar;
import instruments.Piano;
import nonInstruments.MusicBook;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    ArrayList stock;
    Guitar guitar;
    Piano piano;
    MusicBook musicBook;


    @Before
    public void before(){
        musicShop = new MusicShop(1000.00);
        guitar = new Guitar("wood", "black", "string", 100.00, 200.0, false);
        piano = new Piano("oak", "white", "percussion", 250.00, 350.00, "Yamaha");
        musicBook = new MusicBook("Alan Silvestri", "The Music of the Marvel Cinematic Universe", 10.00, 20.00);
    }

    @Test
    public void checkStockStartsEmpty(){
        assertEquals(0, musicShop.getStock().size());
    }

    @Test
    public void canGetTill(){
        assertEquals(1000.00, musicShop.getTill(), 0.01);
    }

    @Test
    public void canAddToStock(){
        musicShop.addToStock(piano);
        musicShop.addToStock(musicBook);
        assertEquals(2, musicShop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        musicShop.addToStock(piano);
        musicShop.addToStock(guitar);
        musicShop.removeFromStock(guitar);
        assertEquals(1, musicShop.getStock().size());
    }

    @Test
    public void canSellProduct(){
        musicShop.addToStock(musicBook);
        musicShop.sellProduct(musicBook);
        assertEquals(1010.00, musicShop.getTill(), 0.01);
        assertEquals(0, musicShop.getStock().size());
    }

}
