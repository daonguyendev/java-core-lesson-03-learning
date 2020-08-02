package com.daonguyen.homework;

import java.util.ArrayList;

public class ProductList {
    ArrayList<Product> products = null;

    public ProductList() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
