/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise12 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal:");
        double p = scan.nextDouble();
        System.out.println("Enter the rate of interest:");
        double r = scan.nextDouble()/100;
        System.out.println("Enter the number of years:");
        double t = scan.nextDouble();
        double a=p*(1+(r*t));
        System.out.println("After "+t+" years at "+r*100+"%, the investment will be worth $"+a+".");
    }
}