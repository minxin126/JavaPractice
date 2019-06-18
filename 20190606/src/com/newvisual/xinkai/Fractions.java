package com.newvisual.xinkai;

/**
 * @Descrption: class about fraction
 * @Author: minx
 * @Date: 2019-6-7
 */
public class Fractions {
    //a,b分别为分子和分母
    public int a;
    public int b;

    public Fractions(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * 将分数转化成浮点类型
     *
     * @param numerator
     * @param denominator
     */
    public double toDouble(int numerator, int denominator) {
        int a = 3, b = 5;
        double c = a / b;
        return c;
    }

    /**
     * 两个分数相乘。
     */
    public Fractions plus(Fractions r) {
        int numerator = a * r.b + b * r.a;
        int denominator = b * r.b;
        return new Fractions(numerator, denominator);
    }

    public Fractions multiply(Fractions r) {
        return new Fractions(a * r.a, b * r.b);
    }

    public void print() {
        System.out.println(a + "/" + b);
    }

    public static void main(String[] args) {
        Fractions fun = new Fractions(1, 2);
        fun.plus(new Fractions(3, 4)).print();
    }
}
