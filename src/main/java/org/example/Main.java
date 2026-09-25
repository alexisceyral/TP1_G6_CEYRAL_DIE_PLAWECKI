package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//faut push
        System.out.println("Please enter the first integer");
        int firstInteger = scanner.nextInt();
        System.out.println("Please enter the second integer");
        int secondInteger = scanner.nextInt();
        int sum = firstInteger + secondInteger;
        System.out.println("The sum of " + firstInteger + " and " + secondInteger + " is equal to " + sum);
    }
}
