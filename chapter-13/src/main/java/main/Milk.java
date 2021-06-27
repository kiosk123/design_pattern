package main;

public class Milk extends AbstAdding {

    public Milk(IBeverage ingredient) {
        super(ingredient);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }

    @Override
    public IBeverage getBase() {
        return super.getBase();
    }
}
