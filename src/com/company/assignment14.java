/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        int order = input.nextInt();
        System.out.println("What is the state? ");
        input = new Scanner(System.in);
        String state = input.nextLine();
        double tax = 1.00;


        if (state.equals("WI")){
            tax = 1.055;
            System.out.println("The subtotal is $" + order + ".00");
            System.out.printf("The tax is $%.2f\n", (tax - 1) * order);
        }

        System.out.printf("The total is $%.2f",(order * tax));
    }
}
