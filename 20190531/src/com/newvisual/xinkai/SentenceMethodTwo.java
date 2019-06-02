package com.newvisual.xinkai;

import java.util.Scanner;

/**
 * @author minx
 * @some descrption:
 * @date:
 */
public class SentenceMethodTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //可以获取一句话的长度,可以输入一句话
        String s = in.nextLine();
        //只能取一个单词，需要按照单个单词来划分
        System.out.println(s);
        int[] newStruct;
        newStruct = getLength(s);
        for (int i = 0; i < s.length(); i++) {
            if (newStruct[i] != 0) {
                System.out.print(" " + newStruct[i]);
            } else {
                break;
            }
        }

    }

    /**
     * 函数一般调用会有一个返回结果，一个函数就做一件事，降耦合
     *
     * @return number
     */
    private static int[] getLength(String s) {
        int wordLength = 0;
        int[] dataLength = new int[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            // 可以识别空格,并且识别空格后需要重新计
            if (s.charAt(i) == ' ' || s.charAt(i) == '.') {
                dataLength[j] = wordLength;
                j++;
                wordLength = 0;
                // 需要统计出每个单词单词的个数，并且用空格作为分隔，而且用.作为结尾。
            } else {
                wordLength++;
            }
        }
        return dataLength;
    }
}
