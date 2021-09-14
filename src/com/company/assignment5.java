/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment5 {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;

        String output = String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",num1,num2,sum,num1,num2,dif,num1,num2,prod,num1,num2,quot);
        System.out.println(output);

    }
}
