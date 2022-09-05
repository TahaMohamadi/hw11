package Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordPermutationsValidation {
    static HashMap<String, String> map = new HashMap<>();

    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            map.put(String.valueOf(chars), String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }
    public static void findPermutations(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        permutations(str.toCharArray(), 0);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String str2 = scanner.next();

        findPermutations(str);
        ArrayList valid = new ArrayList<>();
        for (String element: map.keySet()) {
            valid.add(element);
        }
        if(valid.indexOf(str2)>= 0){
            System.out.printf("Pass");

        }else{
            System.out.printf("Fail");

        }
    }
}
