package org.example;
import domen.Bottle;
import domen.HotDrink;
import domen.Product;
import services.CoinDispenser;
import services.Display;
import services.Holder;
import services.VendingMachine;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> ourlist = getProducts();
        Holder holder = new Holder(4,4);
        Display display = new Display();
        CoinDispenser dispenser = new CoinDispenser(0);
        VendingMachine machine = new VendingMachine(holder, dispenser, ourlist, display);
        for (Product elem : machine.getProducts()) {
            System.out.println(elem);
        }

        //MainFrame myFrame = new MainFrame();
        //myFrame.initialize();
    }

    private static List<Product> getProducts() {
        Product product1 = new Product(1, "Cheaps Lays", 132.55, 13);
        Product product2 = new Product(2, "Milk Chocolate", 55.23, 10);
        Product product3 = new Product(3, "Nuts", 222.55, 15);
        Product bottle1 = new Bottle(4, "Cola", 13.22, 24, 0.5);
        Product hotDrink1 = new HotDrink(5, "Latte", 7.99, 4, 65);
        Product hotDrink2 = new HotDrink(6, "Black Tea", 4.99, 7, 56);
        List<Product> ourlist = new ArrayList<>();
        ourlist.add(product1);
        ourlist.add(product2);
        ourlist.add(product3);
        ourlist.add(bottle1);
        ourlist.add(hotDrink1);
        ourlist.add(hotDrink2);
        return ourlist;
    }
}