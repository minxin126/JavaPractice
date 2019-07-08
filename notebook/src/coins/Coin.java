package coins;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Descrption:
 * @Author: minx
 * @Date:
 */
public class Coin {
    /**
     * 创建哈希表对象
     */
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

    /**
     * 我知道了，set只是一个集合，而hashmap为主键的集合。
     */
    public Coin() {
        coinnames.put(1, "penny");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dolar");
        coinnames.put(50, "五毛");
        //keySet()为一个集合
        System.out.println(coinnames.keySet().size());
        System.out.println(coinnames);
        for (Integer k : coinnames.keySet()) {
            String s = coinnames.get(k);
            System.out.println(s);
        }
    }

    public String getName(int amount) {
        /* coinnames为一个hashmap对象，所以有自己的方法，amount输入*/
        if (coinnames.containsKey(amount)) {
            return coinnames.get(amount);
        } else {
            return "NOT FOUND";
        }
    }

    public static void main(String[] args) {
        System.out.println("请输出键值：");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);

        System.out.println(name);
    }
}
