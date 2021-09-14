/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = input.nextInt();
        final String output = age >= 16
                ? "You are old enough to drive!"
                : "You are not old enough to drive";
        System.out.println(output);
    }
}
