package chapter3;

import java.util.Scanner;

/*

------Nested If Statements-----------
If a certain Situation occurs,
Check for the next Situation


To Qualify for a Loan, a person must make at least $30000 and
        have been working at their current job for atleast 2 years

 */
public class LoanQualifier {

    public static void main(String[] args) {

        int minimalSalary = 30000;
        int minimalYears = 2;

        System.out.println("Enter your current Salary ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.println("Enter the number of years that you worked in this company");
        double years = scanner.nextDouble();

        if (salary >= minimalSalary){
            if (years >= minimalSalary) {
                System.out.println("Congratulation! you are eligible for the loan");
            }else {
                System.out.println("Sorry! you are not eligible for the loan, you must have work for the" + minimalYears + "years");

            }

        }else
        System.out.println("Sorry! you must earn at least $ " +minimalSalary );
    }
}
