package ifElseStatement.ifStatements;

import java.util.Scanner;

public class RetiredExamples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        boolean retiredStatus = age >= 55;

        if(retiredStatus){
            System.out.println("It is your time to get retired!");
        } else {
            System.out.println("Sorry! It is not time to retired.");
        }

        /* if(age >= 55){
               System.out.println("It is your time to get retired!");
           } CAN ALSO BE WRITTEN THIS WAY SINCE YOU DON'T HAVE TO STORE THE DATA; USED ONLY 1X */


    }
}
