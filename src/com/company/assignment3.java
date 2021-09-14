/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = input.nextLine();

        System.out.println("Who said it? ");
        String person = input.nextLine();

        System.out.println(person + " says, \"" + quote + "\"");
    }
}
