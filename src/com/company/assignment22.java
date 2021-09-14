/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c, max;

        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();
        System.out.println("Enter the third number: ");
        c = input.nextInt();

        if(a > b){
            max = a;
        }else{
            max = b;
        }
        if(max < c){
            max = c;
        }

        System.out.printf("The largest number is %d", max);
    }
}
