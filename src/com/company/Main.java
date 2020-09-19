package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the amount of numbers: ");
        int size = new Scanner(System.in).nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
            if (i == arr.length) break;
        }
        System.out.print("Your nums: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");

        System.out.print("Odd nums: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) System.out.print(arr[i] + " ");
        }
        System.out.print("Even nums: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.print("Numbers that are divisible by 9 or 3: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 | arr[i] % 9 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");
        System.out.print("Numbers that are divisible by 5 and 7: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 & arr[i] % 7 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");
        System.out.println("=====================");
        String s;
        char ch[] = new char[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 & arr[i] <= 999) {
                s = String.valueOf(arr[i]);
                ch = s.toCharArray();
                if (ch[0] != ch[1] & ch[1] != ch[2] & ch[0] != ch[2]) {
                    System.out.print(ch[0] + ch[1] + ch[2] + " ");
                    //  for (int j = 0; j < ch.length; j++) {
                    //  System.out.print(ch[0]+ch[1]+ch[2]+" ");
                    //System.out.print(Character.getNumericValue(ch[j])+" ");
                    //}
                }
            }
        }
    }
}




