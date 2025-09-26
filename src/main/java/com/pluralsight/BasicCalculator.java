package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Ask user for first number
        System.out.println("Enter your First Number: ");
        int firstNumber = scanner.nextInt();

//        Ask user for second number
        System.out.println("Enter your Second Number: ");
        int secondNumber = scanner.nextInt();

//        Fake Menu
        System.out.println("Possible Calculations: \n    (A)dd\n    (S)ubtract\n    (D)ivide\n    (M)ultiply\nPlease select an option: ");
        char userChoice = scanner.next().charAt(0);

//      Calculation and prints
        int calcValue = firstNumber * secondNumber;

        System.out.printf("%d * %d = %d  ", firstNumber, secondNumber, calcValue);
    }
}
