package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет по скоростной трассе");
    }

    @Override
    public void steering() {
        System.out.println("Меняет направление движения с помощью совокупности рулевых механзмов");
    }
}

