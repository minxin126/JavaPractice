/**
 * @author:wangminxin @Version:1.0
 * @time:2019-5-18
 * @teacher:kai
 */
package com.visual.example;

import java.util.Scanner;

public class OddAndEven {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("输入一些数字：");
    //    int someNumber=in.nextInt();
    //    System.out.println(someNumber);
    String inputString = in.nextLine();
    String[] stringArray = inputString.split(" ");
    int[] num = new int[stringArray.length];
    int Odd = 0;
    int Even = 0;
    for (int i = 0; i < stringArray.length; i++) {
      num[i] = Integer.parseInt(stringArray[i]);
      System.out.println(num[i] + " ");
      if (num[i] % 2 == 0) {
        Odd = Odd + 1;
      } else if (num[i] % 2 == 1) {
        Even = Even + 1;
      } else if (num[i] == -1) {
        System.out.println("输入结束");
        System.out.println("奇数个数:" + Even + " " + "偶数个数:" + Odd);
        return;
      }
    }
    // 需要求出数组里面的奇数和偶数个数
    // number%2==0为偶数，==1为奇数
    // 用两个if来判断，如果满足条件则变量增加1
  }
}
