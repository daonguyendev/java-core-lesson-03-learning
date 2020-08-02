package com.daonguyen;

import com.daonguyen.homework.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static List<Product> products;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        products = new ArrayList<>();

        int feature;
        boolean flag = true;

        do {
            System.out.println("Which feature do you want you to do: ");
            System.out.println("1. Enter product list\n"
                    + "2. Print product list\n"
                    + "3. Add new product\n"
                    + "4. Edit existing product\n"
                    + "5. Remove existing product\n"
                    + "Press feature which you want to choose or any other number to exit");
            feature = scanner.nextInt();

            switch (feature) {
                case 1:
                    enterProductList();
                    break;
                case 2:
                    displayProductList();
                    break;
                case 3:
                    // TODO: implement add new product feature here
                    break;
                case 4:
                    // TODO: implement edit existing product feature here
                    break;
                case 5:
                    // TODO: implement remove existing product feature here
                    break;
                default:
                    System.out.println("We don't have this feature!");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    private static void displayProductList() {
        System.out.println("\nEmployee list information is: ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s \n", "Code", "Name", "Producer", "Size", "Weight");

        for (int i = 0; i < products.size(); i++) {
            products.get(i).printProduct();
        }
        System.out.println();
    }

    private static void enterProductList() {
        System.out.println("Enter product info below");

        System.out.print("Code: ");
        Long code = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Producer: ");
        String producer = scanner.nextLine();

        System.out.print("Product type (1. Mobile - 2. IPad - 3. Laptop): ");
        int productType = Integer.parseInt(scanner.nextLine());

        Product product = null;
        switch (productType) {
            case 1:
                product = new Mobile(code, name, producer);
                break;
            case 2:
                System.out.print("Size: ");
                int size = Integer.parseInt(scanner.nextLine());
                product = new IPad(code, name, producer, size);
                break;
            case 3:
                System.out.print("Weight: ");
                int weight = Integer.parseInt(scanner.nextLine());
                product = new Laptop(code, name, producer, weight);
                break;
            default:
                break;
        }

        // Add product to list
        products.add(product);
        System.out.println();
    }
}
