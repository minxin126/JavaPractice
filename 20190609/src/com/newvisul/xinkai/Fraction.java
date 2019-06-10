//package com.newvisul.xinkai;
//
///**
// * @Descrption:
// * @Author: minx
// * @Date:
// */
//public class Fraction {
//    private int a;
//    private int b;
//
//    public Fraction(int a, int b) {
//        this.a = a;
//        this.b = b;
//        simp();
//    }
//
//    public double toDouble() {
//        return ((double) a) / b;
//    }
//
//    public void print() {
//        if (a == 1 && b == 1) {
//            System.out.println(1);
//        } else {
//            System.out.println(a + "/" + b);
//        }
//    }
//
//    public Fraction plus(Fraction r) {
//        int fenzi = a * r.b + r.a * b;
//        int fenmu = b * r.b;
//        return new Fraction(fenzi, fenmu);
//    }
//
//    public Fraction multiply(Fraction r) {
//        return new Fraction(a * r.a, b * r.b);
//    }
//
//    private void simp() {
//        int gcd = gcd(a, b);
//        if (gcd != 1) {
//            a = a / gcd;
//            b = b / gcd;
//        }
//    }
//
//    private int gcd(int a, int b) {
//        while (b != 0) {
//            //取余数
//            int t = a % b;
//            a = b;
//            b = t;
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        toDouble();
//        print();
//    }
//
//}
