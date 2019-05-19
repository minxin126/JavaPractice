package com.jingdong.example;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入我的名字：");
        String myName;
        myName = in.nextLine();
        System.out.println("我的名字：" + myName);
    }
}











