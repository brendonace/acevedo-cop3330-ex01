/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment17 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 0 if you are a female and a 1 if you are a male");
        check(input);
        double r = (0.66 + (input.nextInt() * 0.07));
        System.out.println("How many ounces of alcohol did you have?");
        check(input);
        int a = input.nextInt();
        System.out.println("What is your weight, to the nearest pound?");
        check(input);
        int w = input.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        check(input);
        int h = input.nextInt();

        double bac = (a * 5.14 / w * r) - 0.015 * h;
        final String output = bac < 0.08
                ? "It is legal for you to drive."
                : "It is illegal for you to drive.";
        System.out.println(String.format("Your BAC is %.6f\n" + output,bac));

    }

    static void check(Scanner input){
        while(!input.hasNextInt()){
            System.out.println("Wrong input... please try again:");
            input.next();
        }
    }

}
