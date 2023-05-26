package org.example;

import org.example.Domen.Product;
import org.example.VendingMachine.VendingMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JComboBox tfProductName;

    JLabel lbWelcome;

    public MainFrame(JComboBox tfProductName) throws HeadlessException {
        this.tfProductName = tfProductName;

    }

    public void initialize() {


        JLabel lbProductName = new JLabel("Product Name");
        lbProductName.setFont(mainFont);

//        tfProductName = new JMenuBar();
        tfProductName.setFont(mainFont);


        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbProductName);
        formPanel.add(tfProductName);


        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);



        JButton btnOk = new JButton("Купить");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String productName = (String) tfProductName.getSelectedItem();

                lbWelcome.setText("Стоимость " + productName + " ");


            }

        });


//        JButton btnClear = new JButton("Clear");
//        btnClear.setFont(mainFont);
//        btnClear.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                tfProductName.setText("");
//                tfProductName.setText("");
//                lbWelcome.setText("");
//
//            }
//
//        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
//        buttonPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);


        mainPanel.add(lbWelcome, BorderLayout.CENTER);


        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);


        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}