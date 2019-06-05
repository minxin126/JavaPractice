//package com.newvisual.xinkai;
//
//import java.util.Random;
//
///**
// * @Descrption: 函数重载，参数不同
// * @Author: minx
// * @Date: 2019-6-5
// */
//public class ConstructorTest {
//
//    public static void main(String[] args) {
//        Employee[] staff = new Employee[3];
//        staff[0] = new Employee("harry", 40000);
//        staff[1] = new Employee(60000);
//        staff[2] = new Employee();
//        for (Employee e : staff) {
//            System.out.println("name:" + e.getName() + ",id:" + e.getId() + ",salary=" + e.getSalary());
//        }
//    }
//
//}
//
//class Employee {
//    private static int nextId;
//    private int id;
//    private String name = "";
//    private double salary;
//
//    static {
//        Random generator = new Random();
//        nextId = generator.nextInt(10000);
//    }
//
//    {
//        id = nextId;
//        nextId++;
//    }
//
//    Employee(String n, double s) {
//        name = n;
//        salary = s;
//    }
//
//    Employee(double s) {
//        this("Employee #" + nextId, s);
//    }
//
//    Employee() {
//
//    }
//
//    String getName() {
//        return name;
//    }
//
//    double getSalary() {
//        return salary;
//    }
//
//    int getId() {
//        return id;
//    }
//
//}
