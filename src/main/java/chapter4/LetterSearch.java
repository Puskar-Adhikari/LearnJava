package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        //Get Text
        System.out.println("Enter the text for letter search ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        boolean letterFound = false;

        for(int i=0; i<text.length(); i++){
            char currentLetter=text.charAt(i);
            if(currentLetter =='A'|| currentLetter == 'a'){
                letterFound=true;
                break;

            }

        }
        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }else{
            System.out.println("This text doesnot contains the letter 'A'");
        }
    }

}
