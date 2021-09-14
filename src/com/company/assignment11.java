/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        int euros = input.nextInt();
        System.out.println("What is the exchange rate? ");
        double rate = input.nextDouble();


        System.out.println(euros + " euros at an exchange rate of " + rate + " is " + String.format("%.2f",(euros * rate)) + " U.S. Dollars.");
    }
}
