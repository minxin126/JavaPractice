package com.newvisual.xinkai;

import java.util.Scanner;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
public class SixthweekHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //可以获取一句话的长度
        String s = in.nextLine();
        //只能取一个单词
//        String s1 = in.next();
//        String s2 = s.substring(1, 3);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }

//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s1.length());
}

