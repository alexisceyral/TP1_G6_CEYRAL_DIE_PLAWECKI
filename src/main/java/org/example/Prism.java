package org.example;

import java.util.Scanner;

public class Prism {
    public static void volume() {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the length
        System.out.println("Please enter the length");
        double length = scanner.nextDouble();

        // Ask for the width
        System.out.println("Please enter the width");
        double width = scanner.nextDouble();

        // Ask for the height
        System.out.println("Please enter the height");
        double height = scanner.nextDouble();

        // Calculate the volume
        double volume = length * width * height;

        // Display the result
        System.out.println("The volume of the rectangular prism is equal to " + volume);
    }

    public static void main(String[] args) {
        volume();
    }
}