/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert Fahrenheit to Celsius.\nPress F to convert Celsius to Fahrenheit. ");
        String unit = input.nextLine();
        String ask = "";
        if(unit.equalsIgnoreCase("f")){
            ask = "Fahrenheit";
        }else if(unit.equalsIgnoreCase("c")){
            ask = "Celsius";
        }
        System.out.println("Please enter the temperature in " + ask);
        input = new Scanner(System.in);
        int temp = input.nextInt();
        if(unit.equalsIgnoreCase("f")){
            temp = (temp - 32) * 9 / 5;
            System.out.println("The temperature in Celsius is " + temp);
        }else{
            temp = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + temp);
        }
    }
}
