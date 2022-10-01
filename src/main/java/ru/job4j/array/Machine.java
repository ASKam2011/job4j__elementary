package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int ost = money - price;
        for (int coin = 0; coin < coins.length; coin++) {
            while (ost >= coins[coin]) {
                rsl[size++] = coins[coin];
                ost -= coins[coin];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
