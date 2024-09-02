package com.telran.prof.org.algoritms;

import java.util.Scanner;
public class HomeworkThree {

    //Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
    //или слово NO в противном случае.
    //Операцией возведения в степень пользоваться нельзя!
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input num: ");
            int num = in.nextInt();

            while (num != 1 && num % 2 == 0) {
                num /= 2;
            }
            if (num == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }

