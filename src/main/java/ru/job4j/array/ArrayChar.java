package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int ind = 0; ind < pref.length; ind++) {
            if (word[ind] != pref[ind]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
