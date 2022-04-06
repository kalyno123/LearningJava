package ifElseStatement.ifStatements;

import java.util.Scanner;

public class MathGradeExamples {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Hey David! Please enter your math grade?");
    int davidsGrade = scan.nextInt();

    if(davidsGrade >= 60) {
        System.out.println("Awesome! You have passed the math class!");
    } else {
        System.out.println("Sorry! Time to study more.");
    }

    char c = 'k'; // this is false so statement it won't print.
        if(c == 's') {
            System.out.println("Awesome!");
        }



    }
}
