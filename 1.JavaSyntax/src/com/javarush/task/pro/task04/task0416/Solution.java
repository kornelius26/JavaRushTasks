package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cola = scanner.nextInt();
        int peoples = scanner.nextInt();
        double fin = 1.0*cola/peoples;
        System.out.println(fin);




    }
}