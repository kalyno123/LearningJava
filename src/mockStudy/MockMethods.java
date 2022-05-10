package mockStudy;

import java.util.ArrayList;
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
        int i = 0;
        for (Integer element : a){
            newArray[i++] = element;
        }
        return newArray;
    }

    // another way to do wb27
    public static int[] removeDuplicate(int[] arr){
        ArrayList<Integer> uniques = new ArrayList<>();
        for(int i: arr){
            if(!uniques.contains(i)) uniques.add(i);
        }
        int[] newArr = new int[uniques.size()];
        for(int i = 0; i < uniques.size(); i++){
            newArr[i] = uniques.get(i);
        }
        return newArr;
    }

    //mock3 wb#28
    public static String removeDups(String[] s){
        HashSet<String> a = new HashSet<>(); // container
        for (String element : s){
            a.add(element);
        }
        return Arrays.toString(a.toArray());
    }

    //mock3 wb#46
    public static int[] factorial(int[] arr){
        for (int i = 0; i <arr.length ; i++){
            int f = 1;
            for (int j = arr[i]; j >= 2; j--){
                f *= j;
            } arr[i] = f;
        } return arr;
    }

    // wb#
    public static int countPrime(int[] arr) {
        int count = 0;
        for (int element : arr) {// int i = 0; i < arr.length; i++
            boolean isPrime = true;
            if (element < 2) continue; // if (arr[i] < 2) continue;
            for (int j = 2; j < element; j++) { // int j = 2; j < arr[i]; j++
                if (element % j == 0) {// if (arr[i] % j == 0)
                    isPrime = false;
                    break;
                }
            } if (isPrime) count++;
        }
        return count;
    }

    // wb30
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        else{
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }


    public static int mock3Bonus(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i)))   {
                sum += Integer.parseInt(String.valueOf(word.charAt(i)));
            }
        }
        return sum;
    }








}
