/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        int p = input.nextInt();
        System.out.println("Enter the percent rate of interest: ");
        double r = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int t = input.nextInt();

        String output = String.format("After %d years at %.1f%%, the investment will be worth $%.0f.",t,r,(p*(1 + (r/100) * t)));
        System.out.println(output);
    }
}
