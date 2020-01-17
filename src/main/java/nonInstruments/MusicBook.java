package nonInstruments;

import behaviour.ISell;

public class MusicBook implements ISell {

    private String author;
    private String title;
    private double buyingPrice;
    private double sellingPrice;

    public MusicBook(String author, String title, double buyingPrice, double sellingPrice) {
        this.author = author;
        this.title = title;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double markUp(){
        return sellingPrice -= buyingPrice;
    }
}
