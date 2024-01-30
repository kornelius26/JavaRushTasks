package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int w = 1;
            while (w <= 20) {
                if (i == 1 || i == 10) {
                    System.out.print('Б');
                } else if (w == 1 || w == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                w++;
            }
            System.out.println();
            i++;
        }
    }
}


