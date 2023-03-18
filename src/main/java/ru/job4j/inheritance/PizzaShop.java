package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println(pizza.name());
        PizzaExtraCheese pizzaCheese = new PizzaExtraCheese();
        System.out.println(pizzaCheese.name());
        PizzaExtraCheeseExtraTomato pizzaTomato = new PizzaExtraCheeseExtraTomato();
        System.out.println(pizzaTomato.name());
    }
}
