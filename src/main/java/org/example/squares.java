package org.example;

import java.util.Scanner;

public class squares {
    public static void squares() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a non-negative integer");
        int n = scanner.nextInt();

        for (int x = 1; x <= n; x++) {
            int square = x * x;
            System.out.println(x + "\t" + square);
        }
    }
    public static void main(String[] args) {
        squares();
    }
}
