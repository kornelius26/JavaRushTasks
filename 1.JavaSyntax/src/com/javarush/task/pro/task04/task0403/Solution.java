package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while(!isExit) {
            if(scanner.hasNextInt()) {
                int count = scanner.nextInt();
                sum = sum + count;

            }else if(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if (str.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);

 //напишите тут ваш код

    }
}