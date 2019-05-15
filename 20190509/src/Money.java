package money;

import java.util.Scanner;

public class Money {
  public static void main(String args[]) {
    System.out.println("你好");

    Scanner in = new Scanner(System.in);
    int amount = 100;
    int price = 0; // 初始化变量部分
    System.out.print("请输入票面：");

    amount = in.nextInt();
    System.out.print("请输入金额：");

    price = in.nextInt();

    System.out.println(amount + "-" + price + "=" + (amount - price));
    System.out.println(amount + "-" + price + "=" + (amount - price));
  }
}
