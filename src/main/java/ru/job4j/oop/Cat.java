package ru.job4j.oop;

import java.sql.SQLOutput;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + ", " + this.food);
    }

    public String sound() {
        String voice = "may may";
        return voice;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There is gav`s name, there is gav`s food:");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        System.out.println("There is black`s name, there is black`s food:");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show();
    }
}
