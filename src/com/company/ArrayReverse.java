package com.company;

public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("===========ArrayRevers=================");

        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
        int N = args.length;
        for (int i = 0; i < N / 2; i++) {
            String temp = args[i];
            args[i] = args[N - 1 - i];
            args[N - i - 1] = temp;
        }
        System.out.println("Reverse: ");

        for (String x : args) {
            System.out.println("args = " + x);
        }
        System.out.println("=====================================");
    }
}
