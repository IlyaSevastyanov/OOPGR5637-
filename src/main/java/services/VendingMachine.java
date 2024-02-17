package services;

import domen.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDespender coinDespender;
    private List<Product> products;

    public VendingMachine(Holder holder, Display display, CoinDespender coinDespender, List<Product> products) {
        this.holder = holder;
        this.display = display;
        this.coinDespender = coinDespender;
        this.products = products;
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

    public CoinDespender getCoinDespender() {
        return coinDespender;
    }

    public void setCoinDespender(CoinDespender coinDespender) {
        this.coinDespender = coinDespender;
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
                ", coinDespender=" + coinDespender +
                ", products=" + products +
                '}';
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
}
