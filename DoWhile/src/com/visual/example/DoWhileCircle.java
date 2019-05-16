package com.visual.example;

import java.util.Scanner;

public class DoWhileCircle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = (int) (Math.random() * 100 + 1);
    int Counter = 0;
    int gussNumber;
    do {
        System.out.print("请输入一个数字：");
      gussNumber = in.nextInt();
        Counter += 1;
      if (gussNumber > number) {
        System.out.println("猜大了");
      } else if (gussNumber < number) {
        System.out.println("猜小了");
      } else {
        System.out.println("恭喜你，猜对了！" + "你猜了" + Counter + "次");
      }
    } while (gussNumber != number);
  }
}
