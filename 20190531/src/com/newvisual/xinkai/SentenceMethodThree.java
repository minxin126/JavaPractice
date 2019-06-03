package com.newvisual.xinkai;

/**
 * @Descrption:about sentence lengths
 * @Author: minx
 * @Date:2019-6-2
 */
public class SentenceMethodThree {
    private static void sum(int a, int b) {
        int i;
        int sum = 0;
        for (i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(a + "到" + b + "的和是" + sum);
    }

    private static int factor(int i) {
        if (i == 1) {
            return i;
        }
        return i * factor(i - 1);
    }

    public static void main(String[] args) {
        int k = factor(3);
        sum(1, 2);
        System.out.println(k);
    }
}
