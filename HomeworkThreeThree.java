package com.telran.prof.org.algoritms;

import java.util.Scanner;

public class HomeworkThreeThree {
    //Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input num: ");
        int n = in.nextInt();

        System.out.println("Fibonacci number of " + n + " is " + fibonacci(n));
    }
}

