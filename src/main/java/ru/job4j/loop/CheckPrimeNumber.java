package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = number > 1;
        for (int num = 2; num < number; num++) {
            if (number % num == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
