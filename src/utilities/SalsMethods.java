package utilities;

public class SalsMethods {

    // WRITE A METHOD TO FIND THE MAX OF 4 INT NUMBERS AND PRINTS IT OUT ONLY.
    public static void printMaxOf4(int n1, int n2, int n3, int n4){
        System.out.println(Math.max(Math.max(Math.max(n1, n2), n3), n4));
    }

    // WRITE A METHOD TO FIND THE MAX OF 4 INT NUMBERS AND RETURNS IT.
    public static int findMaxOf4(int n1, int n2, int n3, int n4){ // --> void is replaced with int to return int value
        return (Math.max(Math.max(Math.max(n1, n2), n3), n4));
    }

    // CREATE A METHOD THAT GENERATES A NUMBER BETWEEN 10 AND 25 (BOTH INCLUDED) AND PRINT IT
    public static void isNumberBetween10And25(int num){
        System.out.println(num >= 10 && num <= 25);
    }

    //
    public static void printHalfAndQuarter(int num){
        if (num <= 50){
            System.out.println(num + " is in 1st half");

            if (num <= 25){System.out.println(num + " is in 1st quarter");}
            else{System.out.println(num + " is in 2nd quarter");}

        }else System.out.println(num + " is in the 2nd half");

        if (num <= 75){
            System.out.println(num + " is in the 3rd quarter");
        }else{
            System.out.println(num + " is in the 4th quarter");
        }

    }
    /* Create a method which will take an int as ang argument and returns a String.
    If the int number is in between -50/ 0 return "The number is negative and more than -50"
    If the int number is in between 0/ 50 return "The number is positive and less than 50"
    If the int number is  0 return "The number is zero"
    If the number is 9 return "You have hit the lucky number!"
    If the number is -11 return "You have hit the unlucky number!" */

    public static String luckyUnluckyNumber(int num) {
        if (num == -11) return "You have hit the lucky number!";
        else if (num == 9) return "You have hit the unlucky number!";
        else if (num > -50 && num < 0) return "The number is negative and more than -50";
        else if (num == 0) return "The number is zero";
        else if (num > 0 && num < 50) return "The number is positive and less than 50";
        else return "the number you provided is not good for this game";

        /* if -11 not at the beginning but more towards the end then it will never be reachable bc -11 fits this condition
        (num > -50 && num < 0) once it hits this it will run the block of code (return) and won't go any further.

        ----> MORE OFTEN THEN NOT YOU WANT TO ARRANGE THE RAREST CONDITIONS FIRST AND ASCEND FROM THERE.

            public static void main(String[] args) {
        // EDGE CASES ---> aka BOUNDARY CASES
        System.out.println(luckyUnluckyGame(-11));
        System.out.println(luckyUnluckyGame(9));
        System.out.println(luckyUnluckyGame(0));
        System.out.println(luckyUnluckyGame(-12));
        System.out.println(luckyUnluckyGame(49));
        System.out.println(luckyUnluckyGame(-75));
        System.out.println(luckyUnluckyGame(34223));

         */
    }

    /* SAL TASK 2 REQUIREMENTS FOR JAVA METHODS:
    •Create a method which will take an int for age and String as a
    name
    •if the age is older than 30 and first letter is uppercase print out "Age
    and letter checks out"
    •if the age is older than 30 and first letter is lowercase print out "Age
    checks out but letter doesn't"
    •if the age is equal or younger than 30 and first letter is uppercase
    print out "Age doesn't check out but letter does"
    •if the age is equal or younger than 30 and first letter is lowercase
    print out "Nothing checks out"
    */

        // AGE MORE THAN 30 || LESS THA OR EQUAL TO 30
        // NAME BEING UPPERCASE || NAME BEING LOWERCASE

        public static void checkAgeAndName(String name, int age){
            if(age > 30){
                if(Character.isUpperCase(name.charAt(0))){
                    // age is > 30 and firs letter is uppercase
                    System.out.println("Age and letter checks out");
                }
                else{
                    // age is > 30 and firs letter is lowercase
                    System.out.println("Age checks out but letter doesn't");
                }
            }
            else{
                if(Character.isUpperCase(name.charAt(0))){
                    // age is <= 30 and firs letter is uppercase
                    System.out.println("Age doesn't check out but letter does");
                }
                else{
                    // age is <= 30 and firs letter is lowercase
                    System.out.println("Nothing checks out");
                }
            }
        }

        /* public static void main(String[] args) {
            //EDGE CASES - BOUNDARY CASES
            checkAgeAndName("Abe", 31); // name and age checks out
            checkAgeAndName("Data", 25); // name checks out but age doesn't
            checkAgeAndName("kaly", 35); // age checks out but name doesn't
            checkAgeAndName("guluzar", 19); // nothing checks out     */


    }







