package com.newvisul.xinkai;

/**
 * @Descrption:
 * @Author: minx
 * @Date:
 */
public class Display {
    /**
     * 下面为成员变量，类的内部才能使用
     */
    private int value = 0;
    private int limit = 0;

    /**
     * 这就是它的构造函数
     */
    public Display(int limit) {
        //this应该指的是这个类的成员变量
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        //java中通过构造器函数来new一个对象，构造器为构造函数
        //构造函数的作用初始化对象，new 构造器函数=对象。
        Display d = new Display(24);
        for (; ; ) {
            //然后可以使用对象的各种方法。
            d.increase();
            System.out.println(d.getValue());
        }
    }
}
