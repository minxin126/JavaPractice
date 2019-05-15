package Hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Please input some word:");
        Scanner in = new Scanner(System.in);//读取字符
        System.out.println("ECHO:"+in.nextLine());
    }
}

//just for test