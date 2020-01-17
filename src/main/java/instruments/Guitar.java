package instruments;

public class Guitar extends Instrument {

    Boolean electric;

    public Guitar(String material, String colour, String type, double buyingPrice, double sellingPrice, Boolean electric) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.electric = electric;
    }

    public Boolean getElectric() {
        return electric;
    }

    public String play(){
        return "Smoke on the water...";
    }
}
