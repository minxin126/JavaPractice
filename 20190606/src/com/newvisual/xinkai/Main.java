package com.newvisual.xinkai;

import java.util.Scanner;

/**
 * @Descrption: number
 * @Author: minx
 * @Date: 2019-6-7
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入分子和分母：");
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).plus(new Fraction(5, 6)).print();
        a.print();
        b.print();
        in.close();

    }

}

/**
 * 记得构造函数没有任何返回值
 */
class Fraction {
    Fraction(int a, int b) {
        int s = a / b;
    }

    double toDouble(int a, int b) {
        double s = a / b;
        return s;
    }

    public void print() {
    }

    public void plus(Fraction b) {
//        return toDouble() + b;
    }
}
