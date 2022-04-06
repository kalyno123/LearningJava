package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter a number:");
        int number = scan.nextInt();
        scan.nextLine();
        return number;

    }

    public static String getAStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter a String: ");
        String str = scanner.nextLine();
        return str;
    }


}
