import java.util.HashMap;

/**
 * @Descrption: the distance of two city.
 * @Author: minx
 * @Date: 2019-06-25
 */
public class CityRoadDistance {
    public CityRoadDistance() {
        //构造函数，起给类初始化的作用。
    }

    /*首先我觉得需要用HashMap把这些数据都存起来，但是这样就不能用数组来做。
    HashMap是一种集合，没有特定的顺序。所以接下来看输入的数据是随机的两个数字
    还是特定的数组。看图片为二维数组。距离
     */
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> s = new HashMap<>();
//        s.put("taihu", HashMap < "anqing", 5 >);
//        s.put("anqing", 15);
        //需要用hashset吗？
//        map<String, map<String, Integer>> ;
//        map< "北京"，map< "上海"，1216 >> ;
//        s.put("beiing", HashMap < String, Integer >);
        System.out.println(s);
    }
}
