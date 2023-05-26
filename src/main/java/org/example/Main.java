package org.example;

import org.example.Domen.Bottle;
import org.example.Domen.HotDrink;
import org.example.Domen.Product;
import org.example.VendingMachine.VendingMachine;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle(2, "Aqua", "Вода", 15, 1);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "масло", "Масло", 59));
        iMachine.addProduct(new Bottle(4, "Cola", "Вода", 36, 2));
        iMachine.addProduct(new HotDrink(5, "Latte", "Cofe", 75, 250));
        iMachine.addProduct(new HotDrink(6, "Green", "Tea", 95, 60));

        JComboBox jComboBox = new JComboBox();

        for (Product prod : iMachine.getProducts()) {
            jComboBox.addItem(prod.getProductName());
        }

        MainFrame myFrame = new MainFrame(jComboBox);
        myFrame.initialize();

        for (Product prod : iMachine.getProducts()) {
            System.out.println(prod);

        }

    }
}