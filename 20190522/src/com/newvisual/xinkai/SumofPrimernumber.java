package com.newvisual.xinkai;
/**
 * homework fo fourth week. function:sum of Prime number.
 *
 * @author minx
 * @date
 */
import java.util.Scanner;

public class SumofPrimernumber {
  // 2是第一个素数，需要求所有的素数的和
  public static void main(String[] args) {
    int number = 0;
    int counter = 0;
    int numberList = 1;
    int[] Prime = new int[100];
    Prime[0] = 2;
    for (int i = 3; i <= 50; i++) {
      int notPrimeFlag = 0;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          // 可以除开
          // 不是素数
          notPrimeFlag = 1; // 合数控制位
          break;
        } else continue;
      }
      // 素数
      if (notPrimeFlag == 0) {
        Prime[numberList] = i;
        numberList++;
      }
    }
    for (int i = 0; i < numberList; i++) {
      // numberList的长度就是素数的个数
      // 2-4的素数如何解决，从数组里面拿，使用for循环依次取出来求和，序号需要都减去1，取到合适的数据
      System.out.println(Prime[i]);
    }
    Scanner in = new Scanner(System.in);
    System.out.println("输出起始数据和结束数据：");
    int begin = in.nextInt();
    int end = in.nextInt();
    int sum = 0;
    for (int i = begin; i <= end; i++) {
      sum = sum + Prime[i - 1]; // 规定范围内的素数的和
    }
    System.out.println(sum);
  }
}
