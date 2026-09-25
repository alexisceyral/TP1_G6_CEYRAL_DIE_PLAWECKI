package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        float myFloat = scanner.nextFloat();
        scanner.nextLine();  // ⭐ AJOUTEZ CETTE LIGNE pour "nettoyer" le buffer

        System.out.println("I have an int: " + myInt);
        System.out.println("I have a float: " + myFloat);
        System.out.println("Hello, what is your first name ?");
        String myString = scanner.nextLine();
        System.out.println("My name is: " + myString);
    }
}
