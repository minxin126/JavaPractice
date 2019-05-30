package com.newvisual.xinkai;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
public class Constructor {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 7500, 1987, 12, 15);
        staff[1] = new Employee("marry", 60000, 1548, 1, 30);
        staff[2] = new Employee("alice", 2000, 1232, 3, 20);
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}

