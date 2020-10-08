package ru.vsu.cs.yagodintsevNikitaAndreevich;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите конечное число: ");

        int res = getFibonacciSum(scanner.nextInt());
        if (res != -1) {
            System.out.println("Сумма чётных членов последовательности фибоначи: " + res);
        }
        else {
            System.out.println("Йессс минус три");
        }
    }

    private static int getFibonacciSum(int lastNum){
        if(lastNum >= 2) {
            int summ = 0;

            int j = 0;
            for (int i = 1; i <= lastNum; i = i + j) {
                j = i - j;
                if (i % 2 == 0) {
                    summ += i;
                }
            }
            return summ;
        }
        return -1;
    }
}
