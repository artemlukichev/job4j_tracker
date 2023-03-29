package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет по рельсам");
    }

    @Override
    public void steering() {
        System.out.println("Не меняет направление движения");
    }
}

