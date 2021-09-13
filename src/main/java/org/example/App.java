package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        int price = input.nextInt();
        System.out.println("Enter the quantity of item 1:");
        int quantity = input.nextInt();

        double subTotal = price*quantity;

        System.out.println("Enter the price of item 2:");
        price = input.nextInt();
        System.out.println("Enter the quantity of item 2:");
        quantity = input.nextInt();

        subTotal = subTotal + price*quantity;

        System.out.println("Enter the price of item 3:");
        price = input.nextInt();
        System.out.println("Enter the quantity of item 3:");
        quantity = input.nextInt();

        subTotal = subTotal + price*quantity;
        System.out.println("Subtotal: $" + subTotal);


        double tRate = 0.055;
        double tax = tRate*subTotal;
        System.out.println("Tax: $" + tax);

        double total = tax + subTotal;
        System.out.println("Total: $" + total);

    }
}
