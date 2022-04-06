package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

    // ClassName variableName = new DataType(System.in); <-- (System.in) is specific to SCANNER
        Scanner inputReader = new Scanner(System.in);

        System.out.println("What is your address?"); // this is what I want user to input
        String userAddress = inputReader.nextLine(); // variableName.methodName();

        System.out.println("User address is = " .concat("\"" + userAddress + "\""));

    }
}
