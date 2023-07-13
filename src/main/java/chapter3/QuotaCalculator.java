package chapter3;
/*
If-else Statement

If a certain situation occurs,
<do something>

otherwise,
<do somethings else>
 */

 /*
All Salespeople are expected to make at least 10 sales each week.

        For those who do, they receive a Congratulation Message

        For those who don't, they are informed of how many sales they were short.
*/


import java.util.Scanner;

public class QuotaCalculator {

        public static void main(String[] args) {

        int minimalSales = 10;

        System.out.println("Enter the number of sales that you did this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales >= minimalSales){
            System.out.println("Congratulation! you meet the Sales Quota ");

        }else {
            int salesShort = minimalSales - sales;
            System.out.println("Sorry you dind't meet the sales quota by " +salesShort);
        }
    }

}



