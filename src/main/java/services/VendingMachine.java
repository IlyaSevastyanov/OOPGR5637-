package services;

import domen.Product;
import java.util.List;


public class VendingMachine {
    private Holder holder;
    private CoinDispenser dispenser;
    private List<Product> ourList;
    private Display display;

    public VendingMachine(Holder holder, CoinDispenser dispenser, List<Product> ourList, Display display) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.ourList = ourList;
        this.display = display;
    }

    public List<Product> getProducts() {
        return ourList;
    }

    public void buyProduct(Product p, int price) {
        if (ourList.contains(p) && holder.getBalance() >= price) {
            if (dispenser.dispense(price)) {
                releaseProduct(p, holder);
                display.print("You have successfully bought " + p.getName() + ".");
            }
        } else {
            display.print("Product not available or insufficient balance.");
        }
    }

    public void releaseProduct(Product p, Holder h) {
        h.release(0, 0);
        ourList.remove(p);
    }

    public void cancel() {
        dispenser.giveChahge(0, 0);
    }

    public Holder getHolder() {
        return holder;
    }

    public CoinDispenser getDispenser() {
        return dispenser;
    }

    public List<Product> getAssort() {
        return ourList;
    }

    public Display getDisplay() {
        return display;
    }
}