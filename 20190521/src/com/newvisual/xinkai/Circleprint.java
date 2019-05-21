package com.newvisual.xinkai;

import java.util.Scanner;

public class Circleprint {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入一个数字：");
    int giveNumber = in.nextInt();
    double result = 0.0;
    double sign = 1.0;
    for (int i = 1; i <= giveNumber; i++) {
      result = result + (sign / i); // 浮点数运算一定要转换成浮点数
      sign = -1.0;
    }

    System.out.println(result);
  }
}
