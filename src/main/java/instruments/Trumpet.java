package instruments;

public class Trumpet extends Instrument {

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
}
