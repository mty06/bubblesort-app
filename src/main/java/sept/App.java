package sept;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        Integer[][] tests = {
                {70, 61, 72, 83, 38},
                {7, 2, 76, 4, 99},
                {28, 9, 13, 78, 19},
                {68, 84, 41, 62, 18},
                {37, 57, 40, 13, 50}
        };
        for (Integer[] t : tests) {
            System.out.println(Arrays.toString(sorter.sort(t)));
        }
    }
}