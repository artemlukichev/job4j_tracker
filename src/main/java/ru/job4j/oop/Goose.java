package ru.job4j.oop;

public class Goose implements Animal {
    public void sound() {
        System.out.println(getClass().getSimpleName() + " приносит перо для подушек.");
    }
}
