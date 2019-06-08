package com.newvisual.xinkai;

import java.util.Scanner;

/**
 * @Descrption: number
 * @Author: minx
 * @Date: 2019-6-7
 */
public class Main {
    private static Fraction r;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入分子和分母：");
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
//        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
//        b.print();
//        a.plus(b).print();
//        a.multiply(b).plus(new Fraction(5, 6)).print();
        a.print();
//        b.print();
        System.out.println(a.toDouble(1, 2));
//        in.close();
        System.out.println(a.multiply(r));
        //myself output
    }

}

/**
 * 记得构造函数没有任何返回值
 */
class Fraction {
    private int aNumber;
    private int bNumber;

    public Fraction(int a, int b) {
        aNumber = a;
        bNumber = b;
    }

    double toDouble(int a, int b) {
        float s = (aNumber / bNumber);
        return s;
    }

    public void print() {
        System.out.println("我打印了");
    }

    public void plus(Fraction r) {
        double l = r.toDouble(1, 2);
        l = l + 1;
    }

    public double multiply(Fraction r) {
//        r.toDouble(aNumber, bNumber);
//        double result = r.toDouble(aNumber, bNumber);
//        return result;
        System.out.println("啥也每个");
        //将自己的分数加上之前的分数
        return r.toDouble(aNumber, bNumber);
    }
}
