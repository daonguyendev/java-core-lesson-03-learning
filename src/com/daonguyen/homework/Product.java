package com.daonguyen.homework;

public class Product {
    private long code;
    private String name;
    private String producer;

    public Product() {}

    public Product(long code, String name, String producer) {
        super();
        this.code = code;
        this.name = name;
        this.producer = producer;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void printProduct() {
        System.out.printf("%-10s %-20s %-20s %-20s %-20s \n", code, name, producer, "N/A", "N/A");
    }
}
