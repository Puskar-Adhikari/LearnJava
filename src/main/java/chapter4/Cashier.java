package chapter4;

import java.util.Scanner;

/*
-----------For Loop--------------

Count Controlled
--Loop runs a spedified number of times

Pre-Test
---Condition is tested before entering the loop

execution
--Best to user when the loop may or may not need to execute, based on the situation.

//write a cashier program that will scan a given number of items and tally the cost.

 */
public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total=0;

        for(int i=0; i<quantity; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;

        }
        scanner.close();
        System.out.println("your total is $" +total);
    }

}
