package com.newvisual.xinkai;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
class Employee {
    private static int nextId;
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
    }
}
