package homework;

import java.util.Scanner;

public class Height {
    public static void main(){
        int foot = 0;
        int inch = 0;
        Scanner in = new Scanner(System.in);
        foot=in.nextInt();
        inch=in.nextInt();
        System.out.println(10/3);
        System.out.println("foot="+foot+",inch="+inch);
        System.out.println((foot+inch/12.0)*0.3048);
    }

}
