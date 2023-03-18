package ru.job4j.inheritance;

public class IceCreamPlusJam extends IceCream {
    private static final int JAM_PRICE = 50;

    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }

    public static void main(String[] args) {
        IceCreamPlusJam iceCream = new IceCreamPlusJam(4);
        System.out.println(iceCream.price());
    }
}