package com.company;

import java.util.Scanner;

public class HelloProgram {
    public static void main(String[] args) {
        System.out.println("===========EnteringName=================");

      System.out.print("Enter your name: ");
        String next = new Scanner(System.in).next();
        System.out.println("Hello, " + next);
        System.out.println("========================================");
        System.out.println("\n");

        for (String arg :
                args) {
            System.out.println("arg = " + arg);

        }
    }
}
