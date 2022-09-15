package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double credit = amount;
        while (credit > 0) {
            year++;
            credit = (credit + credit * percent / 100) - salary;
        }
        return year;
    }
}
