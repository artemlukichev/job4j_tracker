package ru.job4j.oop;

public class Dog implements Animal {
    public void sound() {
        System.out.println(getClass().getSimpleName() + " не любит кошек, постоянно за ними гоняется.");
    }

    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
    }
}
