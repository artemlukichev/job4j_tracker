package ru.job4j.oop;

public class Car extends Transport {
    private String brand;
    private String model;

    public Car() { }

    public static TripComputer getTripCompute() {
        Car car = new Car("Марка", "Модель");
        Car.TripComputer tripComputer = car.new TripComputer();
        return tripComputer;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public class Transmission {

        public void accelerate() {
            System.out.println("Ускорение");
        }

    }

    public class Brakes {

        public void brake() {
            System.out.println("Торможение");
        }

    }

    public class TripComputer {
        private String model = "Модель TripComputer";
        public String tripData = "Бортовой компьютер";

        public void getInfo() {
            System.out.println("Марка: " + brand);
            System.out.println("Модель: " + Car.this.model);
            System.out.println("Модель TripComputer: " + model);
        }

    }

}
