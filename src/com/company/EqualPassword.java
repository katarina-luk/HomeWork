package com.company;

import java.util.Scanner;

public class EqualPassword {
    public static void main(String[] args) {
        System.out.println("============CheckPassword===============");
        while (true) {
            System.out.print("Enter your password: ");
            String next1 = new Scanner(System.in).next();
            System.out.print("Retype your password: ");
            String next2 = new Scanner(System.in).next();
            if(next1.equals(next2)) System.out.print("Your passwords are equal\n");
            else System.out.println("You make mistake\n");
        }
    }
}
