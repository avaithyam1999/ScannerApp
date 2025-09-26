package com.pluralsight;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Get the user's first name
        System.out.print("What is your first name: ");
        String firstName = scanner.nextLine();

        System.out.printf("Hello and Welcome, %s!", firstName);

//      Get the user's age
        System.out.print("\nHow old are you? ");
        int userAge = scanner.nextInt();

        System.out.printf("So your name is %s and you are %d years old.", firstName, userAge);

//      Get the user's height in meters
        System.out.println("\nPlease enter your height in meters: ");
        double userHeight = scanner.nextDouble();

        System.out.printf("Your name is %s and your age is %d and you are %.2f meters tall", firstName, userAge, userHeight);

//      Ask if they like Java
        System.out.println("\nDo you like Java? Enter true or false");
        boolean userLikesJava = scanner.nextBoolean();

        System.out.printf("User Summary:\nName: %s\nAge: %d\n Height(m): %f\nLikes Java: %b", firstName, userAge, userHeight, userLikesJava);
    }
}
