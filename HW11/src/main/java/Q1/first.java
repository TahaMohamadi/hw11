package Q1;

import java.util.HashMap;

public class first {
    public static void main(String[] args) {
        String a = "CATC";
        char[] b = a.toCharArray();
        System.out.println("a : " + a);
        System.out.println("b.length : " + b.length);
        System.out.println("b[0] : " + b[0]);
        System.out.println("b[1] : " + b[1]);
        System.out.println("b[2] : " + b[2]);
        int num = 1;
        for(int i = 1 ; i<=a.length(); i++){num = num * i; }
        System.out.println("num: " + num);
        HashMap<String, String> map = new HashMap<>();
        map.put(a, "a");
        System.out.println("map : " + map);
    }
}
