package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
//        importing scanner
        Scanner scanner = new Scanner(System.in);

//        ask for user's name
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

//        How many hours worked(as a floating)
        System.out.print("How many hours have you worked this week? ");
        double hoursWorked = scanner.nextDouble();

//        pay rate(floating point)
        System.out.print("How much do you get paid hourly? ");
        double payRate = scanner.nextDouble();

//        display employee's name and their gross pay at the end
        double weekPay = payCalc(hoursWorked, payRate);
        System.out.format("This week you will get paid $%.2f", weekPay);
    }
    //    calculate their pay for the week
    public static double payCalc(double hoursWorked, double payRate) {
        return hoursWorked * payRate;
    }
}
