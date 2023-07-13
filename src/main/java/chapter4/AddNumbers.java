package chapter4;

import java.util.Scanner;

/*
Do While Loop

Condition-Controlled
------Loop Continue running while the specific condition remains true

Post-test
Condtion is tested after completing the loop

Execution
Best to use when the loop may or may not need to execute, based on the situations



###
Write a Program that allows a user to enter two numbers, and then sums up the two numbers.

The user should be able to repeat this action until they indicate they are done.


 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter the first number");
            double num1= scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2= scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is " +sum);

            System.out.println("would you like to start over? true to continue");
            again = scanner.nextBoolean();


        }while (again);
        scanner.close();
    }

}
