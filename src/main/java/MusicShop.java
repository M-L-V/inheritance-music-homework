import behaviour.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private double till;


    public MusicShop(double till) {
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double getTill(){
        return till;
    }

    public void addToStock(ISell product){
        stock.add(product);
    }

    public void removeFromStock(ISell product){
        stock.remove(product);
    }

    public void sellProduct(ISell product){
        double profit = product.markUp();
        till += profit;
        removeFromStock(product);
    }
}
