import java.util.Scanner;

public class Commondivisor {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入两个数：");
    int firstNumber = in.nextInt();
    int secondNumber = in.nextInt();
    int gcd = 1;
    for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
      if (firstNumber % i == 0 && secondNumber % i == 0) {
        gcd = i;
      }
    }
    System.out.println(gcd);
  }
}
