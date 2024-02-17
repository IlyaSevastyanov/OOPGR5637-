package domen;

public class HotDrink extends Product{
    private int temp;

    public HotDrink(long id, String name, double price, int place, int temp) {
        super(id, name, price, place);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" + super.toString() + "temp=" + temp + "}";
    }
}
