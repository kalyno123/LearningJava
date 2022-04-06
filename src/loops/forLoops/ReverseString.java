package loops.forLoops;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    /* PRACTICE TASK:
    Write a program that reads a name from user
    Reverse the name and print it back
    Test data:
    Kaly
    Expected output:
    ylaK
    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scan.next().trim();
        /* HARD CODED TEST DATA: Kaly
        System.out.println(name.charAt(0)); // first char
        System.out.println(name.charAt(name.length()/2 - 1));
        System.out.println(name.charAt(name.length()/2));
        System.out.println(name.charAt(name.length() - 1)); // last char

        System.out.println("" + name.charAt(name.length() - 1) + name.charAt(name.length()/2) + name.charAt(name.length()/2 - 1) +
                name.charAt(0));
        */
        String reverse = ""; // this "container" is created to have a place to store the result from for-loops; also converts results to Strings
        for (int i = name.length() - 1; i >= 0; i--){ // SAME AS: for(last char; first char; backwards)
            reverse += name.charAt(i); // the results from for-loops added each iteration (+=) to the "container"
        }
        System.out.println("The reverse name is = " + reverse);
        // if you want to reuse the result from the for-loops you have to first store it as a variable






    }
}
