package com.daonguyen.inheritance;

import java.util.Scanner;

public class Employee {
    private long code;
    private String name;
    private String email;
    private String mobile;

    Scanner scanner = new Scanner(System.in);

    public Employee() {}

    public Employee(int code, String name, String email, String mobile) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void printEmployee() {
        System.out.printf("%-10s %-20s %-20s %-20s \n", code, name, email, mobile);
    }

    public Employee add() {
        scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter your code to add: ");
        employee.setCode(scanner.nextLong());
        scanner.nextLine();
        System.out.print("Enter your name to add: ");
        employee.setName(scanner.nextLine());
        System.out.print("Enter your email to add: ");
        employee.setEmail(scanner.nextLine());
        System.out.print("Enter your mobile to add: ");
        employee.setMobile(scanner.nextLine());

        System.out.print("\nNew employee after adding is: \n");
        System.out.printf("%-10s %-20s %-20s %-20s \n", "Code", "Name", "Email", "Mobile");
        System.out.printf("%-10s %-20s %-20s %-20s \n", employee.getCode(), employee.getName(),
                                                        employee.getEmail(), employee.getMobile());
        System.out.println();

        return employee;
    }

    public Employee edit(Employee employee) {
        System.out.print("Enter your code to edit: ");
        employee.setCode(scanner.nextLong());
        scanner.nextLine();
        System.out.print("Enter your name to edit: ");
        employee.setName(scanner.nextLine());
        System.out.print("Enter your email to edit: ");
        employee.setEmail(scanner.nextLine());
        System.out.print("Enter your mobile to edit: ");
        employee.setMobile(scanner.nextLine());

        System.out.print("\nThe employee after editing is: \n");
        System.out.printf("%-10s %-20s %-20s %-20s \n", "Code", "Name", "Email", "Mobile");
        System.out.printf("%-10s %-20s %-20s %-20s \n", employee.getCode(), employee.getName(),
                employee.getEmail(), employee.getMobile());
        System.out.println();

        return employee;
    }

    public Employee remove(Employee employees[], int removingIndex) {
        //TODO: need to implement remove feature here
        return null;
    }
}
