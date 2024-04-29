package ArrayQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
