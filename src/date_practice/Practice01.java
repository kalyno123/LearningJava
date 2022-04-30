package date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

    /* TASK 1:
    Write a program that asks user to enter their date of year
    Then calculate their age and print with the message below
    EXPECTED OUTPUT:
    You are {age} years old!
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your date of birth year:");
        int birthYear = scan.nextInt();

        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int age = Integer.parseInt(sdf.format(currentDate)) - birthYear;

        System.out.println("You are " + age + " years old!");




    }
}
