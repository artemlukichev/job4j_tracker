package ru.job4j.oop;

public class Pet implements Animal {
    public void sound() {
        System.out.println(getClass().getSimpleName() + " нуждается в прививках, чтобы не болеть.");
    }
}
