package chapter3;

import java.util.Scanner;

/*
If-else-if Statement (If more than two possible path)

if situation A occurs,
<do Something>.

Else if situation B occurs,
<do somethings else>

Else if situation C occurs,
<do somethings else>


 */
public class TestResults {
    public static void main(String[] args) {
        //Get the test score from the users
        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();


        // Determine the letter grade
         char grade;

         if(score< 60){
             grade = 'F';
         }
         else if(score< 70){
             grade = 'D';
         }
         else if(score< 80){
             grade = 'C';
         }
         else if(score< 90){
             grade = 'B';
         }
         else {
             grade ='A';
         }
         System.out.println(" your grade is " + grade);

    }
}
