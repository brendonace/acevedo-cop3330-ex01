/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tax = 1.00;
        System.out.println("What is the order amount? ");
        int order = input.nextInt();
        System.out.println("What is the state? ");
        input = new Scanner(System.in);
        String state = input.nextLine();

        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")){
            tax = 1.055;
            System.out.println("What county do you live in? ");
            String county = input.nextLine();
            if(county.equalsIgnoreCase("Dane")){
                tax += 0.004;
            } else if(county.equalsIgnoreCase("Eau Claire")){
                tax += 0.005;
            }
        } else if(state.equalsIgnoreCase("IL") || state.equalsIgnoreCase("Illinois")){
            tax += 0.08;
        }

        System.out.printf("The tax is $%.2f\nThe total is $%.2f",(tax - 1) * order, order * tax);
    }
}
