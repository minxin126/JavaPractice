package com.jindong.example;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    int type = 0;
    Scanner in = new Scanner(System.in);
    type = in.nextInt();
    switch (type) {
      case 1:
        System.out.println("你好");
        break;
      case 2:
        System.out.println("早上好");
        break;
      case 3:
        System.out.println("晚上好");
        break;
      case 4:
        System.out.println("再见");
        break;
      default:
        System.out.println("啊，什么啊");
    }
  }
}
