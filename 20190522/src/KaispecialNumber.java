import java.util.Scanner;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
public class KaispecialNumber {
  // 各位数字的幂之求和
  private static int digitCubeSum(int num) { // 数字三次幂求和
    int sum = 0, add = 0;
    double digit;

    double length = Integer.toString(num).length(); // 获取num的长度,求各位数字的次方和
    // for example:363
    while (num > 0) { // 循环一直除到个位
      digit = num % 10; // 个位余数
      num /= 10; // 百位十位，左移动一位
      add = (int) Math.pow(digit, length); // 数字的长度的次方
      sum += add; // 算出和sum=sum+add
    }
    return sum;
  }

  // 是否是水仙花数
  private static boolean isNarcissistic(int num) {
    return num == digitCubeSum(num) ? true : false; // 等于本身就是水仙花数
  }
  // 第n个水仙花数
  private static int nthNarcissistic(int n) {
    int candidate, count;
    for (candidate = 0, count = 0; count < n; ++candidate) {
      if (isNarcissistic(candidate)) { // if只会根据里面的结果是true或者false选择是否执行
        ++count;
      }
    }
    return candidate - 1;
  }

  // 是否是回文数
  private static boolean isPalindrome(int integer) {
    int palindrome = integer;
    int reverse = 0;

    while (palindrome != 0) {
      int remainder = palindrome % 10; // 个位
      reverse = reverse * 10 + remainder; //
      palindrome = palindrome / 10; //
    }
    return integer == reverse;
  }
  //  主函数
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int sum = 0;
    for (int i = nthNarcissistic(n); i < nthNarcissistic(m); i++) {

      sum += (isPalindrome(i) ? i : 0);
    }
    System.out.println("sum = " + sum);
  }
}
