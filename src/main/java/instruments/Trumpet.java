package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    int valveNum;

    public Trumpet(String material, String colour, String type, double buyingPrice, double sellingPrice, int valveNum) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.valveNum = valveNum;
    }

    public int getValveNum() {
        return valveNum;
    }

    public String play(){
        return "toot toot";
    }

    public double markUp(){
        return sellingPrice -= buyingPrice;
    }
}
