package com.newvisual.xinkai;

import java.util.Scanner;

/**
 * some descrption.
 *
 * @author minx
 * @date
 */
public class SentenceHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //可以获取一句话的长度,可以输入一句话
        System.out.println("请输入一句话，空格分隔单词，.句号为结尾：");
        String s = in.nextLine();
        //只能取一个单词，需要按照单个单词来划分
        System.out.println(s);
        getLength(s);
    }

    /**
     * 函数一般调用会有一个返回结果，一个函数就做一件事，降耦合
     * 实现一句话中每个单词的字符长度，并且输出对应长度
     */
    private static void getLength(String s) {
        int wordLength = 0;
        for (int i = 0; i < s.length(); i++) {
            // 可以识别空格,并且识别空格后需要重新计数
            // 需要统计出每个单词单词的个数，并且用空格作为分隔，而且用.作为结尾。
            if (s.charAt(i) == ' ' || s.charAt(i) == '.') {
                System.out.print(" " + wordLength);
                wordLength = 0;
            } else {
                wordLength++;
            }
        }
    }
}