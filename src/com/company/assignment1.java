 /*
  *  UCF COP3330 Fall 2021 Assignment 1 Solution
  *  Copyright 2021 Brendon Acevedo
  */

package com.company;
import java.util.Scanner;

public class assignment1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");

        String name  = input.nextLine();
        String concat = "Hello, " + name + ", nice to meet you!";

        System.out.println(concat);


        }
    }


