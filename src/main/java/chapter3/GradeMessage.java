package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "Excellent Job";
                break;

            case "B":
                message = "Great Job";
                break;

            case "C":
                message = "Good Job";
                break;

            case "D":
                message = "you need to work hard";
                break;

            case "F":
                message ="uh,oh!";
                break;

            default:
                message = "Invalid grade";
                break;

        }

        System.out.println(" ON the basis of your grade :" + message);


    }
}
