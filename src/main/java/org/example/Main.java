package org.example;

import domen.Bottle;
import domen.Product;
import services.CoinDespender;
import services.Display;
import services.Holder;
import services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "cheaps Lays", 132.55, 13);
        Product product2 = new Product(2, "chocolate", 55.23, 10);
        Product product3 = new Product(3, "nuts", 222.55, 15);
        Product bottle1 = new Bottle(4, "Cola", 13.22, 24, 0.5);
        List<Product> ourlist = new ArrayList<>();
        ourlist.add(product1);
        ourlist.add(product2);
        ourlist.add(product3);
        ourlist.add(bottle1);
        Holder holder = new Holder();
        Display display = new Display();
        CoinDespender despender = new CoinDespender();
        VendingMachine machine = new VendingMachine(holder, display, despender, ourlist);
        for (Product elem : machine.getProducts()) {
            System.out.println(elem);
        }
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }

}