package com.pluralsight;
//import the scanner
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
//      create a local scanner
        Scanner scanner = new Scanner(System.in);

//      Ask user for size
        System.out.println("What size sandwich do you want, 1(regular) or 2(large): ");
        int userChoice = scanner.nextInt();

        double price = 0;

//      if statement for determining price
        if (userChoice == 1) {
            price = 5.45;
        } else if (userChoice == 2) {
            price = 8.95;
        }
        else {
            System.out.println("Invalid choice");
        }

//      Create an empty variable for discount
        double discount = 0;
        
//      Ask for user's age
        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();

//      if statement for determining discount
        if (userAge <= 17) {
            discount = 1.1;
        } else if (userAge >= 65) {
            discount = 1.2;
        }
        else {
            discount = 1;
        }
//      calculate final cost
        double totalCost = price * discount;

        System.out.printf("Total cost of sandwich: $%.2f", totalCost);
    }
}
