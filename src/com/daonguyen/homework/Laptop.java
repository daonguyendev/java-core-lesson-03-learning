package com.daonguyen.homework;

public class Laptop extends Product {
    private double weight;

    public Laptop(double weight) {
        this.weight = weight;
    }

    public Laptop(long code, String name, String producer, double weight) {
        super(code, name, producer);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printProduct() {
        System.out.printf("%-10s %-20s %-20s %-20s %-20s \n", getCode(), getName(), getProducer(), "N/A", weight);
    }
}
