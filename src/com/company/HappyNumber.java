package com.company;

import java.util.Scanner;

class HappyNumber {
    public static boolean isHappyNumber(int num) {
        int result = 0;
        int count = 1;
        while (count < 10) {
            result = (int) Math.pow(((num % 100) / 10), 2) + (int) Math.pow((num % 10), 2) + (int) Math.pow((num / 100), 2);
            num = (int) Math.pow(((num % 100) / 10), 2) + (int) Math.pow((num % 10), 2) + (int) Math.pow((num / 100), 2);
            System.out.println("Addition result of " + count + " operation: " + result);
            count++;
            if (result == 1) {
                return true;
            } else {
                if (count == 10) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number which you want to check: ");
        while (true) {
            int num = new Scanner(System.in).nextInt();
            System.out.println("Your number " + num + " is happy: " + isHappyNumber(num));
        }
    }
}