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
        return hours < 8 ? ((hours - 8 + 24) * 100 + minutes) : ((hours - 8) * 100 + minutes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int beijingTime = in.nextInt();
        System.out.println("utcTime=" + timeTransfer(beijingTime));
    }
}
