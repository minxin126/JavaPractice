package com.newHorizon.nineninetable;

import java.util.Scanner;

public class ForBreak {
  // 使用多层for循环来实现用五角、一元、二分来构建一个自己组合的金额
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入需要合成的金额：");
    int amount = in.nextInt();
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + "*" + j + "=" + (i * j) + "\t\t");
      }
      System.out.println();
    }
    // for test just for 5 and 1
    Second_Out:
    for (int l = 1; l <= amount; ++l) {
      int p = l++;
      for (int j = 1; j <= (amount / 5); j++) {
        int o = ++j;
        if (1 * l + 5 * j == amount) {
          System.out.println("l=" + l + "," + "j=" + j);
          break Second_Out;
        }
        //         l++等于l=l+1
        //        System.out.println(l);
      }
    }

    int k = 1;
    int h = 1;
    int m = h++;
    int n = ++k;
  }
}
