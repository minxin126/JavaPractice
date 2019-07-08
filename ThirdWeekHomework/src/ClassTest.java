import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @Descrption:
 * @Author: minx
 * @Date:
 */
public class ClassTest {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> newMap = new HashMap<String, HashMap<String, Integer>>();
        HashMap<String, Integer> jcMap = new HashMap<String, Integer>();
        HashMap<String, Integer> roadMap = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        String city = in.nextLine();

        HashMap<HashMap<String, String>, Integer> stringMap = new HashMap<HashMap<String, String>, Integer>();
        HashMap<String, String> sameMap = new HashMap<String, String>();

        sameMap.put("合肥", "太湖");
        sameMap.put("太湖", "安庆");

        stringMap.put(sameMap, 5);
        System.out.println(stringMap);
//        roadMap.put("合肥", 2);
//        roadMap.put("合肥", 3);


        HashMap<String, HashMap<String, Integer>> doubleMap = new HashMap<String, HashMap<String, Integer>>();
        doubleMap.put("安庆", roadMap);
        doubleMap.put("太湖", roadMap);

        //添加元素
        jcMap.put("陈1", 20);
        jcMap.put("陈2", 22);
        //把基础班添加到大集合
        //就是集合的对象再次作为参数
        newMap.put("jc", jcMap);
        //创建就业班级集合对象
        HashMap<String, Integer> jyMap = new HashMap<String, Integer>();
        //添加元素


        jyMap.put("汪1", 23);
        jyMap.put("汪2", 24);
        //把基础班加到大集合
        //其实很明显，就是集合的对象再次作为参数
        newMap.put("jy", jyMap);

        //遍历集合
        Set<String> newMapSet = newMap.keySet();
        for (String newMapkey : newMapSet) {
            //输出键
            System.out.println(newMapkey);
            //输出值
            HashMap<String, Integer> newMapValue = newMap.get(newMapkey);
            Set<String> newMapValueSet = newMapValue.keySet();
            for (String newMapValueKey : newMapSet) {
                Integer newMapValueValue = newMapValue.get(newMapValueKey);
                System.out.println("\t" + newMapValueKey + "---" + newMapValueValue);
            }

        }

    }
}
