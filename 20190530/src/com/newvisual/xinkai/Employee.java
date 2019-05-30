package com.newvisual.xinkai;

import java.time.LocalDate;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
class Employee {
    /*private static int nextId;
    private int id;
    private String name = "";
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public double getSalary() {
        return salary;
    }*///重载
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
