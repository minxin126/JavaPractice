package com.newvisual.kaixin;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
public class ComplexNumber {
  private static boolean isFactor(int factor, int num) {
    return factor < num && num % factor == 0;
  }

  private static int factorSum(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      sum += (isFactor(i, num) ? i : 0);
    }
    return sum;
  }

  // 是否是完全数
  private static boolean isPerfectNumber(int num) {
    return num == factorSum(num);
  }

  // 第n个完全数
  private static int nthPerfectNumber(int num) {
    int candidate, count;
    for (candidate = 1, count = 0; count < num; ++candidate) {
      if (isPerfectNumber(candidate)) {
        ++count;
      }
    }
    return candidate - 1;
  }

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      System.out.println("第" + i + "个完全数是: " + nthPerfectNumber(i));
    }
  }
}
