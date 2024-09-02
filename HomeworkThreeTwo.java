package com.telran.prof.org.algoritms;

import java.util.Scanner;

//Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
public class HomeworkThreeTwo {

    public static int sumOfDigits(int num) {

        if (num < 10) {
            return num;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = in.nextInt();

        System.out.println("Digits sum of " + num + " is " + sumOfDigits(num));
    }
}
