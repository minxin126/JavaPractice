/**
 * **********************************************************
 *
 * @author:minx function:utc国际协和时和bjt（北京时间）的换算。 relationship:utc=bjt-8 version:1.0.0 time:2019-5-15
 *     ************************************************************
 */
package com.visualworld.example;

import java.util.Scanner;

/** 必须考虑跨天的运算 */
public class CoordinUniverAndBeijingtime {
  /** 可能需要辗转相除法 */
  /** 十位和个位不可能出现超过59的数字 */
  private static int timeTransfer(int beijingTime) {
    // 分别为千位 百位 十位 个位
    int beijingThousand = beijingTime / 1000;
    int beijingHundred = (beijingTime - beijingThousand * 1000) / 100;
    int beijingTen = (beijingTime - (beijingThousand * 1000) - (beijingHundred * 100)) / 10;
    int beijingPer =
        beijingTime - ((beijingThousand * 1000) + (beijingHundred * 100) + (beijingTen * 10));
    return beijingTime < 800
        ? (24 - (8 - beijingHundred)) * 100 + beijingTen * 10 + beijingPer
        : (beijingTime - 800);
  }

  private static boolean checkInput(int beijingTime) {
    // 小时最大值和分钟最大值
    int MAX_FIGURE = 23;
    int MAX_TENFIGURE = 59;
    return (beijingTime / 100 <= MAX_FIGURE) && (beijingTime % 100 <= MAX_TENFIGURE);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("请输入BeijingTime ：");
    // 北京时间
    int beijingTime = in.nextInt();
    while (!checkInput(beijingTime)) {
      System.out.println("数据无效，请重新输入北京时间：");
      beijingTime = in.nextInt();
    }
    System.out.println("utcTime:" + timeTransfer(beijingTime));
  }
}
