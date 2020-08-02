package com.daonguyen;

import com.daonguyen.inheritance.Employee;
import com.daonguyen.inheritance.ExtendedEmployee;

import java.util.Scanner;

public class EmployeeManager {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employees[] = null;
//        Can be changed to ExtendedEmployee to extend Employee class
        ExtendedEmployee extendedEmployees[] = null;

        int feature, employeesNumber = 0;
        long addingEmployeeCode, editingEmployeeCode, removingEmployeeCode, currentCode;
        boolean flag = true;

        do {
            System.out.println("Which feature do you want you to do: ");
            System.out.println("1. Enter employee list\n"
                    + "2. Print employee list\n"
                    + "3. Add new employee\n"
                    + "4. Edit existing employee\n"
                    + "5. Remove existing employee\n"
                    + "Press feature which you want to choose or any other number to exit");
            feature = scanner.nextInt();

            switch (feature) {
                case 1:
                    System.out.print("\nEnter number of employees you want to put to list: ");
                    employeesNumber = scanner.nextInt();
                    employees = new Employee[employeesNumber];

                    for (int i = 0; i < employeesNumber; i++) {
                        System.out.println("Employee number: " + (i + 1));
                        employees[i] = new Employee();
                        inputEmployee(employees[i]);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nEmployee list information is: ");
                    System.out.printf("%-10s %-20s %-20s %-20s \n", "Code", "Name", "Email", "Mobile");

                    for (int i = 0; i < employeesNumber; i++) {
                        employees[i].printEmployee();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("\nEnter the employee code want to add: ");
                    addingEmployeeCode = scanner.nextLong();

                    for (int i = 0; i < employeesNumber; i++) {
                        currentCode = employees[i].getCode();

                        if (addingEmployeeCode != currentCode) {
                            System.out.println("You choose an employee: " + addingEmployeeCode);
                            employees[i].add();
                        } else {
                            System.out.println("This employee code have already existed!\n");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nEnter the employee code want to edit: ");
                    editingEmployeeCode = scanner.nextLong();

                    for (int i = 0; i < employeesNumber; i++) {
                        currentCode = employees[i].getCode();

                        if (editingEmployeeCode == currentCode) {
                            System.out.println("You choose an employee: " + editingEmployeeCode);
                            employees[i].edit(employees[i]);
                        } else {
                            System.out.println("This employee code have not existed yet!\n");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("\nEnter the employee code want to remove: ");
                    removingEmployeeCode = scanner.nextLong();

                    for (int i = 0; i < employeesNumber; i++) {
                        currentCode = employees[i].getCode();

                        if (removingEmployeeCode == currentCode) {
                            System.out.println("You choose an employee: " + removingEmployeeCode);
                            employees[i].remove(employees, i);
                        } else {
                            System.out.println("This employee code have not existed yet!\n");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("We don't have this feature!");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    private static void inputEmployee(Employee employee) {
        System.out.print("Enter your employee code: ");
        employee.setCode(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Enter your employee name: ");
        employee.setName(scanner.nextLine());

        System.out.print("Enter your employee email: ");
        employee.setEmail(scanner.nextLine());

        System.out.print("Enter your employee mobile: ");
        employee.setMobile(scanner.nextLine());
    }
}
