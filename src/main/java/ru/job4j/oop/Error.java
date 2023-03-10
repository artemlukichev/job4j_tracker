package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Active: " + this.active);
        System.out.println("Message: " + this.message);
        System.out.println("Status: " + this.status);
    }

    public static void main(String[] args) {
       Error defaultE = new Error();
       defaultE.printInfo();
       Error server = new Error(true, 500, "Enternal Server Error");
       server.printInfo();
       Error notFound = new Error(true, 404, "Server not found");
       notFound.printInfo();
       Error unavailable = new Error(true, 503, "HTTP Service Unavailable");
       unavailable.printInfo();
    }
}
