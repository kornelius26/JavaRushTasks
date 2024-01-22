package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = sc.nextInt();
        int count2 = sc.nextInt();
        int count3 = sc.nextInt();
        if ((count1 == count2) && (count3 == count1)) {
            System.out.println(count1 + " " + count2 + " " + count3);
        } else if (count1 == count2)  {
            System.out.println(count1 + " " + count2);

        } else if(count1 == count3) {
            System.out.println(count1 + " " + count3);

        } else if (count2 == count3) {
            System.out.println(count2 + " " + count3);

        }

        //напишите тут ваш код
    }
}
