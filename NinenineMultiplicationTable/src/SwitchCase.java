import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入对应的数字1-5：");
    int choice = in.nextInt();
    switch (choice) {
      case 1:
        System.out.println("20多岁的自己，丝毫不比15岁的自己强");
        break;
      case 2:
        System.out.println("隐约雷鸣 阴霾天空 但盼风雨来 能留你在此");
        break;
      case 3:
        System.out.println("隐约雷鸣 阴霾天空 即使天无雨 我亦留此地");
        break;
      case 4:
        System.out.println("大龙猫");
        break;
      case 5:
        System.out.println("起风了，唯有努力生存");
        break;
      default:
        break;
    }
  }
}
