/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height in inches:");
        check(input);
        int h = input.nextInt();
        System.out.println("Please enter your weight to the nearest pound: ");
        check(input);
        int w = input.nextInt();

        double bmi = ((double) w / ( h * h)) * 703;

        System.out.println(String.format("Your bmi is %.1f", bmi));
        if (bmi >= 18.5 && bmi <= 25){
            System.out.println("You are within the ideal range.");
        } else if(bmi < 18.5){
            System.out.println("You are underweight. You should see a doctor.");
        } else {
            System.out.println("You are overweight. You should see a doctor.");
        }


    }

    static void check(Scanner input){
        while(!input.hasNextInt()){
            System.out.println("Wrong input... please try again:");
            input.next();
        }
    }
}
