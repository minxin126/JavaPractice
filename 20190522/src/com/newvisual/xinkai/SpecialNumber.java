package com.newvisual.xinkai;

import java.util.Scanner;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
public class SpecialNumber {
  public static boolean isNarcissistic(int n) {
    return true;
  }

  public static boolean isPalindromic(int n) {
    return true;
  }

  public static void main(String[] args) {
    int NarcList = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] Narc = new int[n];
    for (int i = 1; i <= n; i++) {
      if (isNarcissistic(i) == true) {
        Narc[NarcList] = i;
        NarcList++;
      } else continue;
    }
    int o = in.nextInt(); // o,p属于0-NarcList,并且o<p
    int p = in.nextInt(); // 计算o,p两个水仙花数中间的回文数的和
    int[] Pali = new int[n];
    int PaliList = 0;
    for (int i = Narc[o]; i <= Narc[p]; i++) {
      if (isPalindromic(i) == true) {
        Pali[PaliList] = i;
        PaliList++;
      } else continue;
    }
    int sum = 0;
    for (int i = 0; i <= PaliList; i++) {
      sum = sum + Pali[PaliList];
    }
    System.out.println(sum);
  }
}
