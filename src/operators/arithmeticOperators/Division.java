package operators.arithmeticOperators;

public class Division {
    public static void main(String[] args){

    double num1 = 15;
    double num2 = 2;
    int num3 = 4;
    int num4 = 10;

    double division = num1 / num2;
    double divisionByInt = num1 / num3;
    double divisionByDouble = num4 /num2;

    System.out.println("num1 / num2 = " + division); // double divided by double
    System.out.println("num1 / num3 = " + divisionByInt); // double divided by int
    System.out.println("num4 / num2 = " + divisionByDouble); // int divided by double

    // CAN ALWAYS BE CODED AS (NOTE: THE DATAVALUE IS IN PARENTHESES TO TELL JAVA TO ADD NOT CONCAT):
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 / num3 = " + (num1 / num3));
        System.out.println("num4 / num2 = " + (num4 /num2));







    }
}
