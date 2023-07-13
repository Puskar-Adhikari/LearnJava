package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    //Class name as per Convensation in java

    public static void main(String[] args) {
        //Default Method in java

        // Get the number of Hours worked.
        System.out.println("How many hours you worked this week");
        Scanner scanner = new Scanner(System.in);
        int hours= scanner.nextInt();

        // Get the hourly pay rate.
        System.out.println("What is your hourly pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours and pay rate.
        double Salary= hours* rate;

        // Dispaly Result.
        System.out.println("you get Total Salary amount is $: " +Salary);



    }
}
