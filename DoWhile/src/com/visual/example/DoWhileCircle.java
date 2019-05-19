package com.visual.example;

import java.util.Scanner;

public class DoWhileCircle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = (int) (Math.random() * 100 + 1);
    int Counter = 0;
    int guessNumber;
    do {
      System.out.print("请输入一个数字：");
      guessNumber = in.nextInt();
      Counter += 1;
      if (guessNumber > number) {
        System.out.println("猜大了");
      } else if (guessNumber < number) {
        System.out.println("猜小了");
      } else {
        System.out.println("恭喜你，猜对了！" + "你猜了" + Counter + "次");
      } // 感觉还不错
    } while (guessNumber != number);
    //      while循环
    //    int Counter = 1;
    //    int guessNumber;
    //    System.out.print("请输入一个数字：");
    //    guessNumber = in.nextInt();
    //    while (guessNumber != number) {
    //      Counter += 1;
    //      if (guessNumber > number) {
    //        System.out.println("猜大了");
    //        System.out.print("请输入一个数字：");
    //        guessNumber = in.nextInt();
    //      } else if (guessNumber < number) {
    //        System.out.println("猜小了");
    //        System.out.print("请输入一个数字：");
    //        guessNumber = in.nextInt();
    //      } else {
    //        System.out.println("恭喜你，猜对了！" + "你猜了" + Counter + "次");
    //      }
    //    }
    //    System.out.println("恭喜你，猜对了！" + "你猜了" + Counter + "次");
  }
}
