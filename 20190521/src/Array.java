import java.util.Arrays;
import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    int[] test = new int[10];
    test[0] = 1;
    test[1] = 2;
    test[2] = 3;
    test[3] = 4;
    //    System.out.println(test[0]);
    //    System.out.println(test[1]);
    //    System.out.println(test[2]);
    //    System.out.println(test[3]);
    int birthday[] = new int[10];
    birthday[0] = 1;
    birthday[2] = 2;
    birthday[3] = 3;
    int[] year = new int[10];
    int month[] = new int[10];
    double[][] salary = new double[4][4];
    salary[0][0] = 1;
    salary[0][1] = 2;
    salary[1][1] = 3;
    salary[3][3] = 7;

    System.out.println(salary[0][0]);
    System.out.println(salary[0][1]);
    System.out.println(salary[3][3]);
    Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    int n = in.nextInt();
    int[] number = new int[n];
    for (int i = 0; i < number.length; i++) {
      number[i] = i + 1;
    }
    int[] result = new int[k];
    for (int i = 0; i < result.length; i++) {
      int r = (int) (Math.random() * n);
      result[i] = number[r];
      number[r] = number[n - 1];
      n--;
    }
    Arrays.sort(result);
    for (int r : result) System.out.println(r);
  }
}
