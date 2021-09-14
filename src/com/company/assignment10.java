/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] price = new int[3];
        int[] amt = new int[3];
        double total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the price for item " + (i + 1) + ":");
            price[i] = input.nextInt();
            System.out.println("Enter the quantity of item " + (i + 1) + ":");
            amt[i] = input.nextInt();
            total = total + (price[i] * amt[i]);
        }


        String output = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",total,(total * 0.055),(total * 1.055));
        System.out.println(output);
    }
}
