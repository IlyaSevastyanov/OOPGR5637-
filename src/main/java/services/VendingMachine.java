package services;

import domen.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDispenser coinDispenser;
    private List<Product> products;

    public VendingMachine(Holder holder, Display display, CoinDispenser coinDispenser, List<Product> products) {
        this.holder = holder;
        this.display = display;
        this.coinDispenser = coinDispenser;
        this.products = products;
    }


    /**
     * @param product обьект добавляемого продукта
     * @apiNote добавление продукта в аппарат
     */
    public void addProduct(Product product) {
        if (product.getPrice() <= 0) {
            product.setPrice(100);
        }
        this.products.add(product);
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }

    public void setCoinDispenser(CoinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "holder=" + holder +
                ", display=" + display +
                ", coinDispenser=" + coinDispenser +
                ", products=" + products +
                '}';
    }
}
