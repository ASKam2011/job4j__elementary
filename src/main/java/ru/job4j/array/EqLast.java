package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int ind = 0; ind < left.length; ind++) {
            if (left[left.length - 1] != right[right.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
