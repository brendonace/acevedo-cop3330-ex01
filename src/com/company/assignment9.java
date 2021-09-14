/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your ceiling? (in feet) ");
        int len = input.nextInt();
        System.out.println("What is the width of your ceiling? ");
        int wid = input.nextInt();

        int gallons  = len * wid / 350;
        if(len * wid % 350 != 0){
            gallons += 1;
        }

        System.out.println("You need " + gallons + " gallon(s) of paint to cover " + (len * wid) + " square feet.");
    }
}
