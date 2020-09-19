package com.company;

import java.util.Scanner;

public class RandomNums {
    public static void main(String[] args) {
        System.out.println("============RandomNums===============");
        System.out.println("Enter a number of random nums: ");
        int size = new Scanner(System.in).nextInt();
        int arr[] = new int[size];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * size);
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * size);
            System.out.println(arr[j] + " ");
        }
        System.out.println("===========================");
    }
}
