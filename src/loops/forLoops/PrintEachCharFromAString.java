package loops.forLoops;

public class PrintEachCharFromAString {
    public static void main(String[] args) {
    /* Write a Java program to print each character of given String in a separate line:
    String str = “TechGlobal School”; */

        String str = "TechGlobal School";

        for(int i = 0; i <= (str.length() - 1); i++){
            System.out.println(str.charAt(i));
        }





    }
}


