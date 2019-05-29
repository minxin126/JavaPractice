package com.visualworld.example;

import java.util.Scanner;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
public class Kaisimpleexample {
    private static int timeTransfer(int num) {
        int hours = num / 100;
        int minutes = num % 100;
        return ((hours < 8 ? (hours - 8 + 24) * 100 : (hours - 8) * 100 )+ minutes);
    }
    //输入数字有效性判断器
    private static boolean checkInput(int beijingTime) {
        return (beijingTime/100<=23)&&(beijingTime%100<=59);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int beijingTime = in.nextInt();
        //判定数据是否有效
        while (!checkInput(beijingTime)){
            System.out.println("请重新输入北京时间：");
            beijingTime=in.nextInt();
        }
        System.out.println("utcTime=" + timeTransfer(beijingTime));
    }
}
