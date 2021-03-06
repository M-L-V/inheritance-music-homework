package instruments;


public abstract class Instrument {

    private String material;
    private String colour;
    private String type;
    protected double buyingPrice;
    protected double sellingPrice;

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

