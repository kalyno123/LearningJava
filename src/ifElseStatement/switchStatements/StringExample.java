package ifElseStatement.switchStatements;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, tell me the greeting for the current time");
        String greeting = scan.nextLine();

        switch (greeting){
            case "Good morning":
                System.out.println("it is morning");
            case "Good afternoon":
                System.out.println("it is afternoon");
                break;
            case "Good evening":
                System.out.println("it is evening");
                break;
            case "Good night":
                System.out.println("it is night");
                break;
            default:
                System.out.println("Go back to school." );
        }

    }
}
