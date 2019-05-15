/************************************************************
 @author:minx
  * function:utc国际协和时和bjt（北京时间）的换算。
  * relationship:utc=bjt-8 version:1.0.0
  * time:2019-5-15
  * ************************************************************
 */
package com.myfuture.example;

import java.util.Scanner;

// 必须考虑跨天的运算
public class CoordinUniverAndBeijingtime {
    // 可能需要辗转相除法
    //十位和个位不可能出现超过59的数字
    public static void main(String[] args) {
        //国际协调时
        int CoordinatedUniversalTime;
        // 千位
        int beijingThousand = 0;
        // 百位
        int beijingHundred = 0;
        // 十位
        int beijingTen;
        // 个位
        int beijingPer;
        //        int resultTime = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("请输入BeijingTime ：");
        //北京时间
        int BeijingTime = in.nextInt();
        beijingThousand = BeijingTime / 1000;
        beijingHundred = (BeijingTime - beijingThousand * 1000) / 100;
        beijingTen = (BeijingTime - (beijingThousand * 1000) - (beijingHundred * 100)) / 10;
        beijingPer = BeijingTime - ((beijingThousand * 1000) + (beijingHundred * 100) + (beijingTen * 10));
        if (BeijingTime < 0 || BeijingTime > 2359 || beijingTen > 5) {
            System.out.println("数据无效，请重新输入！");
            return;
        }
        if (BeijingTime >= 1000) // 完整
        {
            beijingThousand = BeijingTime / 1000;
            beijingHundred = (BeijingTime - beijingThousand * 1000) / 100;
            beijingTen = (BeijingTime - (beijingThousand * 1000) - (beijingHundred * 100)) / 10;
            beijingPer = BeijingTime - ((beijingThousand * 1000) + (beijingHundred * 100) + (beijingTen * 10));
            CoordinatedUniversalTime = BeijingTime - 800;
            System.out.println("UTC:" + CoordinatedUniversalTime);
        } else if (BeijingTime >= 800) // 不会跨天
        {
            //            B_thousand=0;
            beijingHundred = BeijingTime / 100;
            beijingTen = (BeijingTime - (beijingHundred * 100)) / 10;
            beijingPer = BeijingTime - ((beijingHundred * 100) + (beijingTen * 10));
            CoordinatedUniversalTime = BeijingTime - 800;
            System.out.println("UTC:" + CoordinatedUniversalTime);
        } else if (BeijingTime < 800 && beijingHundred >= 1) {//开始跨天
//            beijingThousand = BeijingTime / 1000;
            beijingHundred = (BeijingTime - beijingThousand * 1000) / 100;
            beijingTen = (BeijingTime - (beijingThousand * 1000) - (beijingHundred * 100)) / 10;
            beijingPer = BeijingTime - ((beijingThousand * 1000) + (beijingHundred * 100) + (beijingTen * 10));
            CoordinatedUniversalTime = (24 - (8 - beijingHundred)) * 100 + beijingTen * 10 + beijingPer;
            System.out.println("final time:" + CoordinatedUniversalTime);
        } else if (BeijingTime < 60 && BeijingTime > 10) {//有十位
            //            B_thousand=0;
            //            B_hundrend=0;
            beijingTen = (BeijingTime) / 10;
            beijingPer = BeijingTime - (beijingTen * 10);
            CoordinatedUniversalTime = (24 - (8 - beijingHundred)) * 100 + beijingTen * 10 + beijingPer;
            System.out.println("UTC:" + CoordinatedUniversalTime);
        } else {
            beijingTen = 0; // 保留十位的0
            beijingPer = BeijingTime; // 只有个位
            CoordinatedUniversalTime = (24 - (8 - beijingHundred)) * 100 + beijingTen * 10 + beijingPer;
            System.out.println("UTC:" + CoordinatedUniversalTime);
        }
        System.out.println(beijingThousand);
        System.out.println(beijingHundred);
        System.out.println(beijingTen);
        System.out.println(beijingPer);
        System.out.println("UTC:" + CoordinatedUniversalTime);
    }
}
// if (10<a<100)
