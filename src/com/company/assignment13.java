/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
import java.lang.Math;
public class assignment13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the principal amount? ");
        int p = input.nextInt();
        System.out.println("What is the percent rate? ");
        double r = input.nextDouble();
        System.out.println("What is the number of years? ");
        int t = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double a = p * Math.pow((1 + r/n/100),(n * t));

        String output = String.format("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.",p,r,t,n,a);
        System.out.println(output);
    }
}
