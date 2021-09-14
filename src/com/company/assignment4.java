/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = input.nextLine();
        System.out.println("Enter a past-tense verb: ");
        String verb = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj = input.nextLine();
        System.out.println("Enter an adverb: ");
        String adv = input.nextLine();



        String inter = String.format("The %s %s %s %s through the city and everyone laughed!", adj, noun, verb, adv);
        System.out.println(inter);
    }
}
