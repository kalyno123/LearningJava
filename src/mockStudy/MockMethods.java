package mockStudy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class MockMethods {

    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) count++;
        }
        return count;
        // why couldn't i use str.contains(" ")? --> bc its always true.
        // str.contains(" "); This method is checking is the entire string instead of each letter one by one
    }


    public static boolean isOdd(int a){
        return a % 2 == 1;
    } // can it be a % 2 != 0 ? >>YES



    public static int findMiddleOf3Numbers(int a, int b, int c){
        if(a == b || b == c) return b; // what does this block of code mean? MEANS: this is if-else condition for when all the number are equal
        else if(a == c) return a; // this means ... if two numbers are equal return one of the equal --> can be return c as well.
        // THE BELOW CODE IS DYNAMIC AND GIVES EXPECTED OUTPUT. HOWEVER, IF ABOVE CODE ISN'T INCLUDED IT SLOWS THE PERFORMANCE OF EXECUTION

        int greatest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));

        if(a != greatest && a != smallest) return a;
        else if(b != greatest && b != smallest) return b;
        return c;
    }


    public static String reverseString (String str){
        String str1 = "";
        for (int i = str.length()-1; i >= 0; i--){
            str1 += str.charAt(i);
        } return str1;
    }

    //mock3 wb#27
    public static int[] uniques(int[] n){
        //int[] wb27 = {0, 5, 4, 0, 0}; // TEST DATA
        //HashSet<Integer> a = new HashSet<>(); // container to hold uniques (non-dups)
        TreeSet<Integer> a = new TreeSet<>(); // either or collection would work
        for (int element : n) {
            a.add(element);
        }
        int[] newArray = new int[a.size()];
        for (int element : newArray){
            newArray[element] = element;
        }
        return newArray;
        // a.toArray() --> to convert set collection back to array
        // Arrays.toString() --> to print the array w/o location
    }

    //mock3 wb#28
    public static String removeDups(String[] s){
        HashSet<String> a = new HashSet<>(); // container
        for (String element : s){
            a.add(element);
        }
        return Arrays.toString(a.toArray());
    }

    //mock3 wb#
    public static int[] isFactorial(int[] arr){
        for (int i = 0; i <arr.length ; i++){
            int f = 1;
            for (int j = arr[i]; j >= 2; j--){
                f *= j;
            } arr[i] = f;
        } return arr;
    }













}
