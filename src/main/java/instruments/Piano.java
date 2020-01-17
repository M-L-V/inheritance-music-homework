package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    String brand;

    public Piano(String material, String colour, String type, double buyingPrice, double sellingPrice, String brand) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String play(){
        return "the sound of the Black Parade...";
    }

    public double markUp(){
        return sellingPrice -= buyingPrice;
    }
}
