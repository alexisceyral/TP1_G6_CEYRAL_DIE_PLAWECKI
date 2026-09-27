package org.example;

import java.util.Scanner;

public class factoriel {
    public static void factoriel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer");
        int n = scanner.nextInt();

        int factoriel = 1;
        for (int i = 1; i <= n; i++) {
            factoriel *= i;
        }

        System.out.println(n + "! = " + factoriel);
    }
    public static void main(String[] args) {
        factoriel();
    }
}

