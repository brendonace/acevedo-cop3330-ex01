/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Brendon Acevedo
 */

package com.company;
import java.util.Scanner;
public class assignment23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            System.out.print("Are the battery terminals corroded? ");
            answer = input.nextLine();
            if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
                System.out.print("Clean the terminals and try starting again.");
            } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
                System.out.print("Replace the cables and try again.");
            }
        } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
            System.out.print("Does your car make a slicking noise? ");
            answer = input.nextLine();
            if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
                System.out.print("Remove the battery.");
            } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
                System.out.print("Does the car crank up but fail to start? ");
                answer = input.nextLine();
                if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
                    System.out.print("Check spark plug connections.");
                } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
                    System.out.print("Does the engine start and then die? ");
                    answer = input.nextLine();
                    if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
                        System.out.print("Does your car have fuel injection? ");
                        answer = input.nextLine();
                        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
                            System.out.print("Get it in for service.");
                        } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
                            System.out.print("Check to ensure the choke is opening and closing. ");
                        }
                    } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
                        System.out.print("This should not be possible. ");
                    }
                }
            }
        }
    }
}
