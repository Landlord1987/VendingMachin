package org.example.Domen;

public class Product {
    protected int productId;
    protected String productName;//for displaying to customer
    protected String productCategory;
    protected double price;

    public Product(int productId, String productName, String productCategory, double price) throws Exception{
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price <= 0) {
            throw new Exception("Цена не корректна");
        }
        this.price = price;
    }

    public String toString() {
        return "Product{" + "name=" + productName + " productCategory=" + productCategory + " price=" + price + "}";
    }

}
