package org.example.Domen;

public class Bottle extends Product{
    private int volume;

    public Bottle(int productId, String productName, String productCategory, double price, int volume) throws Exception {
        super(productId, productName, productCategory, price);
        this.volume = volume;
    }

    public String toString() {
        return "Product{" + "name=" + productName + " productCategory=" + productCategory + " price=" + price +  " volume=" + volume + "}";
    }
}
