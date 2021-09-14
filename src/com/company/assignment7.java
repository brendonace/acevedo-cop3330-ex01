/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment7 {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("what is the length of the room in feet? ");
        int len = input.nextInt();
        System.out.println("What is the length of the room in feet? ");
        int wid =  input.nextInt();
        System.out.println("You entered the dimensions " + len + " feet by " + wid + " feet.\n");

        int areaf = len * wid;
        double aream = areaf * 0.09290304;

        System.out.println("The area is:\n" + areaf + " square feet\n" + aream + " square meters");

    }
}
