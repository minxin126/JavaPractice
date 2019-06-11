package com.newvisul.xinkai;

/**
 * @Descrption:
 * @Author: minx
 * @Date:
 */
public class Clock {
    private int test = 0;
    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private Display second = new Display(60);

    public void start() {
        while (true) {
            second.increase();
            minute.increase();
            if (second.getValue() == 0) {
                minute.increase();
            }
            if (minute.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());

        }
    }

    /**
     * 需要clock同样设置三个参数
     */
    public Clock(int test) {
        this.test = test;
    }
    public static void main(String[] args) {
        //默认含有一个构造方法，可以直接用
        Clock clock = new Clock(5);
        clock.start();
    }
}
