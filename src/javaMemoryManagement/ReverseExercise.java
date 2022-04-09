package javaMemoryManagement;

public class ReverseExercise {

    /* TASK 1:
    WRITE A METHOD THAT TAKES A STRING ARGUMENT AND RETURN IT REVERSED.
    GIVEN TEST DATA: Hello      RESULT: olleH
    */

    //ONE WAY:
    public static String reverse2(String str){
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            r += (str.charAt(i));
        }
        return r;
    }

    //SECOND WAY:
    public static String reverse1(String str){
        StringBuilder r = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            r.append(str.charAt(i));
        }
        return r.toString();
    }

    //THIRD WAY:
    public static String reverse3(String str){
        return new StringBuilder(str).reverse().toString();
    }










    public static void main(String[] args) {
        System.out.println(reverse1("Hello"));
        System.out.println(reverse2("Hello"));
        System.out.println(reverse3("Hello"));
    }
}
