/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String pass = "123awesome_";

        System.out.println("What is the password? ");
        String guess = input.nextLine();

        if(guess.equals(pass)){
            System.out.println("\nWelcome!");
        }else{
            System.out.println("\nI don't know you o_O");
        }
    }
}
