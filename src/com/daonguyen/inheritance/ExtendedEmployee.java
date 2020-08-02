package com.daonguyen.inheritance;

public class ExtendedEmployee extends Employee {
    private float salary;
    private int workingDays;

    public ExtendedEmployee() {
    }

    public ExtendedEmployee(int code, String name, String email, String mobile) {
        super(code, name, email, mobile);
    }

    public ExtendedEmployee(int code, String name, String email, String mobile, float salary, int workingDays) {
        super(code, name, email, mobile);
        this.salary = salary;
        this.workingDays = workingDays;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
}
