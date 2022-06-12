package homeworks;


public class Homework21 {

    /* TASK 1: Create a method called fizzBuzz1();
    This method will take an int argument, and it will print numbers starting from 1 to given argument.
    BUT, it will print “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5, and “FizzBuzz” for the numbers divided both by 3 and 5.
    */
    public static void fizzBuzz1(int a){
        for (int i = 1; i <= a; i++){
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }


    /* TASK 2: Create a method called fizzBuzz2();
    This method will take an int argument, and it will return a String. BUT it will return “Fizz” if the given number is divided by 3,
    “Buzz” if the number is divided by 5, and “FizzBuzz” if the number is divided both by 3 and 5. Otherwise, it will return number itself.
    */
    public static String fizzBuzz2(int a){
        for (int i = 0; i <= a; i++){
            if (a % 15 == 0) return ("FizzBuzz");
            else if (a % 3 == 0) return ("Fizz");
            else if (a % 5 == 0) return("Buzz");
        }
        return String.valueOf(a);
    }


    /* TASK 3: Create a method called findSumNumbers();
    This method will take a String argument, and it will return an int which is the sum of all numbers presented in the String.
    NOTE: If there are no numbers represented in the String, return 0
    */
    public static int findSumNumbers(String s){
        int sum = 0; // container to hold sum of numbers
        String temp = "0"; // container to hold String format of the numbers
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) temp += s.charAt(i); // checking if the current char is digit
            else { // else if current char is letter ...
                sum += Integer.parseInt(temp); // ... then add to the sum of the digits found prior to letter
                temp = "0"; // reset the String container back to empty
            }
        }return sum + Integer.parseInt(temp);
    }


    /* TASK 4: Create a method called findBiggestNumber();
    This method will take a String argument, and it will return an int which is the number presented in the String.
    NOTE: If there are no numbers represented in the String, return 0.
    */
    public static int findBiggestNumber(String s){
        int max = 0;
        String temp = s.replaceAll("[^\\d]", " ");
        String[] temp2 = temp.replaceAll("[\\s]", " ").split(" ");
        for (String element: temp2){
            if (!element.isEmpty()){
                if (Integer.parseInt(element) > max) max = Integer.parseInt(element);
            }
        }
        return max;
    }

    /* TASK 5: Create a method called countSequenceOfCharacters();
    This method will take a String argument, and it will return a String which is the count of repeated characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!
    */
    public static String countSequenceOfCharacters(String s){
        String result = "";
        int count = 0;
        String str = "";
        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
                str += String.valueOf(s.charAt(i));
            }else{
                result += count;
                result += str;
                count = 0;
                str = "";
            }
        }
        return result;
    }





    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------");
        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(18);

        System.out.println("\n-----TASK 2------");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("\n-----TASK 3------");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

        System.out.println("\n-----TASK 4------");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("\n-----TASK 5------");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));



        /*String s = "ab110c045d";
        int sum = 0;
        int max = Integer.MIN_VALUE;
        String temp = s.replaceAll("[^\\d]", " ");
        String[] temp2 = temp.replaceAll("[\\s]+", " ").split(" ");
        for (String element: temp2){
            if (!element.isEmpty()){
                sum += Integer.parseInt(element);
                if (Integer.parseInt(element) > max) max = Integer.parseInt(element);
            }
        }
        System.out.println(Arrays.toString(temp2));
        System.out.println(sum);
        System.out.println(max);*/

    }
}