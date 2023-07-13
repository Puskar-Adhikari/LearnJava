package chapter3;
/*
IF Statement

--> If a Certain Situation Occurs,
do <Something> and then go back to the Main FLow.
 */
 /*

All salespeople get a payment of $1000 for the week

Salespeople who exceed 10 sales get an additional bonus of $250
  */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        int minimalPayment = 1000;
        int minimalSales = 10;
        int additionalBonus = 250;

        System.out.println("How much sales you did this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if (sales > minimalSales) {
            int salary = minimalPayment + additionalBonus;
            System.out.println(" Congratulation you got bonus with your weekly salary is $: " + salary);

        }else
            System.out.println("you only got your weekly salary amount is $" + minimalPayment);





    }
}
