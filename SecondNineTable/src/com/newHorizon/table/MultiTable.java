package com.newHorizon.table;

public class MultiTable {
    public static void main(String args[]) {
        m(4);
    }

    /**
     * 打印出九九乘法表
     *
     * @param i
     */
    public static void m(int i) {
        if (i == 1) {
            System.out.println("1*1=1\t\t");
        } else {
            m(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t\t");
            }
            System.out.println();
        }
    }
}
