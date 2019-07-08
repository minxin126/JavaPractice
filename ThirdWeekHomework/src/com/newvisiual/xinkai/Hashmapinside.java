package com.newvisiual.xinkai;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Descrption: @Author: minx @Date:
 */
public class Hashmapinside {
    private HashMap<HashSet<String>, Integer> ideaMap = new HashMap<>();
    private static String doubleName;
    private static int number;

    /**
     * 为了实现一次性的输入两个城市名称，中间用空格隔开
     */
//    private static void getStrin(String doubleName) {
//        String str = doubleName;
//        Character[] arr = new Character[str.length()];
//        for (int i = 0; i <= str.length(); i++) {
//            arr[i] = str.charAt(i);
//        }
//    }
    private static int together(String cityNameOne, String cityNameTwo) {

        HashSet<String> compare = new HashSet<>();
        compare.add(cityNameOne);
        compare.add(cityNameTwo);

        HashSet<String> s = new HashSet<>();
        s.add("太湖");
        s.add("安庆");

        HashSet<String> z = new HashSet<>();
        z.add("太湖");
        z.add("合肥");

        HashSet<String> y = new HashSet<>();
        y.add("安庆");
        y.add("合肥");

        HashMap<HashSet<String>, Integer> ideaMap = new HashMap<>();
        ideaMap.put(s, 6);
        ideaMap.put(z, 7);
        ideaMap.put(y, 8);
        // 只能用for each循环来实现.keySet为集合的实体映射，对象映射。循环必须用它的实体映射。
        for (HashSet<String> h : ideaMap.keySet()) {
            if (h.equals(compare)) {
                /* h为hashset,同时也作为hashmap的键值 ，所以传入键值获取变量值number*/
                int number = ideaMap.get(h);
            }
        }
        System.out.println(ideaMap);
        return number;
    }

    public static void main(String[] args) {

        // 需要注意的是我需要输入一个集合的内容，为两个城市的名称。然后根据输入的城市的名称，调出对应的距离。
        // 需要判断对应的集合的内容。如何判断输入内容和集合的内容做对比。如果和哪个匹配，则输出距离。
        // 我仍然需要将输入的元素放入一个集合。然后来判断这连个集合是否相等。因为无法获取集合里面的元素的值。
        System.out.println("输入两个不同的城市名称：");
        Scanner in = new Scanner(System.in);
        String cityNameOne = in.next();
        String cityNameTwo = in.next();
        String doubleName = in.nextLine();
        together(cityNameOne, cityNameTwo);
        System.out.println(number);
//        getStrin(doubleName);

    }
}

