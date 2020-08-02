package com.daonguyen.homework;

public class IPad extends Product {
    private double screenSize;

    public IPad(long code, String name, String producer, double screenSize) {
        super(code, name, producer);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void printProduct() {
        System.out.printf("%-10s %-20s %-20s %-20s %-20s \n", getCode(), getName(), getProducer(), screenSize, "N/A");
    }
}
