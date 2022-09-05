package Q2;

import java.util.TreeSet;

public class treeSet1 {
    public static void main(String[] args) {
        treeSetGenerator(first);

        treeSetGenerator(second);
        System.out.println("first: " + first.toString());
        System.out.println("second: " + second.toString());
    }
    private static void treeSetGenerator(TreeSet<Character> second) {
        for(int i = 1; i<= 10; i++){
            Character b =rndChar();
            if (second.contains(b)){
                i -= 1;
            } else {
                second.add(b);
            }
        }
    }

    static TreeSet<Character> first = new TreeSet<>();
    static TreeSet<Character> second = new TreeSet<>();

    private static char rndChar () {
        int rnd = (int) (Math.random() * 26);
        char base = (rnd < 26) ? 'A' : 'a';
        return (char) (base + rnd % 26);

    }
}
