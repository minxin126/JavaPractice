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
        Fractions a = new Fractions(in.nextInt(), in.nextInt());
        Fractions b = new Fractions(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        //这个地方需要直接返回一个对象类型才可用。
        a.plus(b).print();
        a.multiply(b).plus(new Fractions(5, 6)).print();
        a.print();
        b.print();
        in.close();
    }
}
/**
 * 记得构造函数没有任何返回值
 */
class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double toDouble(int a, int b) {
        double s = (a / b);
        return s;
    }

    public Fraction plus(Fraction r) {
        int numerator = a * r.b + b * r.a;
        int denominator = b * r.b;
        return new Fraction(numerator, denominator);
    }

    public void print() {
        System.out.println(a + "/" + b);
    }

    public Fraction multiply(Fraction r) {
        //将自己的分数加上之前的分数,需要返回一个类才可以继续使用相关的内容
        return new Fraction(a * r.a, b * r.b);
    }
}
