package nonInstruments;

import behaviour.ISell;

public class SheetMusic implements ISell {

    private String piece;
    private String artist;
    private double buyingPrice;
    private double sellingPrice;

    public SheetMusic(String piece, String artist, double buyingPrice, double sellingPrice) {
        this.piece = piece;
        this.artist = artist;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getPiece() {
        return piece;
    }

    public String getArtist() {
        return artist;
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
