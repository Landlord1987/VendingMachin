package org.example.Domen;

public class HotDrink extends Product {

    private int temperature;

    public HotDrink(int productId, String productName, String productCategory, int temperature, double price) throws Exception {
        super(productId, productName, productCategory, price);
        this.temperature = temperature;
    }

    public String toString() {
        return "Product{" + "name=" + productName + " productCategory=" + productCategory + " price=" + price +  " temperature=" + temperature + "}";
    }
}
