package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = false;
        for (int num = 2; num < number; num++) {
            if (number % num != 0) {
                result = true;
            }
            break;
        }
        return result;
    }
}
