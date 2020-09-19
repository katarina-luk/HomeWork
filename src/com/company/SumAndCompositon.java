package com.company;

public class SumAndCompositon {
    public static void main(String[] args) {
        System.out.println("============Sum&CompositionofArgs===============");

        System.out.print("Your args: ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println("\n");
        int sum = 0;
        int arr[]= new int[args.length];
        int composition=1;
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            sum = sum + arr[i];
        }
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            composition *=arr[i];
        }
        System.out.println("Sum of args = " + sum);
        System.out.println("Composition of args = " + composition);
    }
}
