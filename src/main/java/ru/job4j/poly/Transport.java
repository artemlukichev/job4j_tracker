package ru.job4j.poly;

public interface Transport {
    int PRICE = 55;

    void drive();

    void passengers(int count);

     double refuel(double liters);
}
