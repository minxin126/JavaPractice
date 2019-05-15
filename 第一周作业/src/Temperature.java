package homework;

import java.util.Scanner;
import  homework.Height;

public class Temperature {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);//只是给了也给存储对象In
        double F_Tem = 0;
        double C_Tem = 0;
        int C_int = 0;
        System.out.print("请输入华氏温度：");
        F_Tem = in.nextDouble();
//        Various = (9 /5.0);
        C_Tem = (F_Tem - 32) / (9 / 5.0);
//        System.out.println(Various);
        C_int = (int) C_Tem;
//        C_int=Height.class.foot;
        System.out.println("转换为摄氏温度为:" + C_int);

    }
}
