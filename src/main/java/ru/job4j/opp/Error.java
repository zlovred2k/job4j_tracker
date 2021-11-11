package ru.job4j.opp;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active: " + active);
        System.out.println("status: " + status);
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error2 = new Error(true, 10, "ErrorLength");
        Error error3 = new Error(false, 2, "Incorrect type");
        error.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
