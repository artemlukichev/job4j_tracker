package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Транспорт едет");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров: " + count);
    }

    @Override
    public double refuel(double liters) {
        return liters * PRICE;
    }
}
