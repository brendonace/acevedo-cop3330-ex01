/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people are there? ");
        int people = input.nextInt();
        System.out.println("How many pizzas do you have? ");
        int pizzas = input.nextInt();
        System.out.println("How many slices per pizza? ");
        int slices = input.nextInt();

        System.out.println(people + " people with " + pizzas + " pizzas (" + (people * pizzas) + " slices)");
        System.out.println("Each person gets " + (slices * pizzas / people) + " piece(s) of pizza");
        System.out.println("There are " + (slices * pizzas % people) + " leftover pieces.");
    }
}
