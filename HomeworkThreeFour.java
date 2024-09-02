package com.telran.prof.org.algoritms;

import java.util.Scanner;

public class HomeworkThreeFour {
    //Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.
    public static boolean isPalindrome(String s) {
       return isPalindromeRecursive(s, 0, s.length() - 1);
    }
        private static boolean isPalindromeRecursive (String s,int left, int right){
            if (left >= right) {
                return true;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            return isPalindromeRecursive(s, left + 1, right - 1);
        }

        public static void main (String[]args){

            Scanner in = new Scanner(System.in);
            System.out.print("Input a word: ");
            String testString = in.nextLine();

            System.out.println("\"" + testString + "\" is a palindrome: " + isPalindrome(testString));
            }
        }



