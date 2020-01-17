package instruments;

import behaviour.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String material, String colour, String type, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }


}

