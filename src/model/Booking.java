package model;

public class Booking {
    private String customerName;
    private int hours;

    public Booking(String customerName, int hours) {
        this.customerName = customerName;
        this.hours = hours;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getHours() {
        return hours;
    }
}