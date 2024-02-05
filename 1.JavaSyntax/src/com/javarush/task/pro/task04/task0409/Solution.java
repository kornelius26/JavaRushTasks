package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/*
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int count1 = scanner.nextInt();
            int count2 = scanner.nextInt();
            if (count1 < count2) {
                System.out.println(count1);

            }else {
                System.out.println(count2);
            }
        }

    }
}