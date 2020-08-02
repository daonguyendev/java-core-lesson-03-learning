package com.daonguyen.homework;

public class Mobile extends Product {

    public Mobile(long code, String name, String producer) {
        super(code, name, producer);
    }

    public void printProduct() {
        System.out.printf("%-10s %-20s %-20s %-20s %-20s \n", getCode(), getName(), getProducer(), "N/A", "N/A");
    }
}
