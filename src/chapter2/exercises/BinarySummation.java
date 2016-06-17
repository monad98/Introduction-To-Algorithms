package chapter2.exercises;

import java.util.Arrays;

/**
 * Created by monad on 2016. 6. 16..
 */
public class BinarySummation {

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1, 1, 1, 0};
        int[] b = {1, 1, 0, 1, 0, 0, 1, 1};

        BinaryCalculator bc = new BinaryCalculator();
        System.out.print(Arrays.toString(bc.sum(a, b)));
    }

}

class BinaryCalculator {
    int[] sum(int[] a, int[] b) {
        int[] c = new int[a.length + 1];

        int carryover = 0;
        for (int i = c.length-1; i >= 1; i--) {
            c[i] = a[i-1] + b[i-1] + carryover;
            if (c[i] >= 2) {
                carryover = 1;
                c[i] = c[i] - 2;
            }
        }
        c[0] = carryover;
        return c;
    }
}
