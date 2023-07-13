package chapter4;

import java.util.Scanner;

/*
WHile Loop
Each store employee makes $15 an hour.
write a program that allows a manager to enter the number of weekly hours worked for each emeplyee,
and Calculate their pay.
Do not allow for over time.
 */
public class GrossInputValidation {
    public static void main(String[] args) {
        // initalize known varaibles
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){ // hoursWorked= sentinal(control the flow of the loop)
            System.out.println("Invaid entry. your hours must between 1 to 40");
            hoursWorked = scanner.nextDouble();

        }
        scanner.close();
        //calculate gross pay
        double gross = rate * hoursWorked;
        System.out.println(" Gross pay $:" + gross);
        }
    }

