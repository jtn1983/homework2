package work1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int i = 0; i < intList.size(); i++) {
            for (int j = intList.size() - 1; j > i; j--) {
                if (intList.get(i) > intList.get(j)) {
                    Integer tmp = intList.get(i);
                    intList.set(i, intList.get(j));
                    intList.set(j, tmp);
                }
            }
        }

        for (Integer i : intList) {
            if (i <= 0) continue;
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
