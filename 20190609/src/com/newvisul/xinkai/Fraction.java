package com.newvisul.xinkai;

/**
 * @Descrption:
 * @Author: minx
 * @Date:
 */
public class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        //this指的就是这个类
        this.a = a;
        this.b = b;
        simp();
    }

    public double toDouble() {
        return ((double) a) / b;
    }

    public void print() {
        if (a == 1 && b == 1) {
            System.out.println(1);
        } else {
            System.out.println(a + "/" + b);
        }
    }

    /**
     * 直接用类实例化一个对象，然后作为一个函数的参数，r为另外一个对象，面向对象的强大，可以使用类似的变量。
     * 使用类开头的函数，原来需要返回一个对象。
     */
    public Fraction plus(Fraction r) {
        //求两个分数的和
        //分子
        int numerator = a * r.b + r.a * b;
        //分母
        int denominator = b * r.b;
        //可能是直接返回一个对象的值,直接返回一个完整的对象，可以直接使用里面的方法
        return new Fraction(numerator, denominator);
    }

    /**
     * 求两个分数的乘积
     */
    public Fraction multiply(Fraction r) {
        return new Fraction(a * r.a, b * r.b);
    }

    private void simp() {
        int gcd = gcd(a, b);
        if (gcd != 1) {
            a = a / gcd;
            b = b / gcd;
        }
    }

    /**
     * 可能是求两个数字的最大的公约数
     */
    private int gcd(int a, int b) {
        while (b != 0) {
            //取余数
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        //使用类里面的方法，首先要构造一个对象，实例化后才可以使用里面的方法
        Fraction fraction = new Fraction(1, 2);
        fraction.toDouble();
        fraction.print();

        Fraction r = new Fraction(3, 4);
        fraction.plus(r).print();
        //我去，搞了三层嵌套，面向对象编程真强大,面向对象真的很强大
        fraction.plus(r).multiply(r).print();
        fraction.multiply(r).print();
    }

}
