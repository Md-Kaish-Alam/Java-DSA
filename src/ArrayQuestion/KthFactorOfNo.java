package ArrayQuestion;

import java.util.ArrayList;

public class KthFactorOfNo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 3;
        int no = 12;

        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                list.add(i);
            }
        }

        System.out.println(list.get(k - 1));
    }
}
