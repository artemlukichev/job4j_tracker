package ru.job4j.cast;

public class Usage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicles = new Vehicle[]{bus, train, airplane};
        for (Vehicle v : vehicles) {
            v.move();
            v.steering();
        }
    }
}

