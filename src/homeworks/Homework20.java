package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

public class Homework20 {

    /* TASK 1: Create a method called hasLowerCase();
    This method will take a String argument, and it will return boolean true if there is lowercase letter and false if it doesn't.
    */
    public static boolean hasLowerCase(String s){
        boolean isLower = false;

        for (int i = 0; i < s.length(); i++){
            if (Character.isLowerCase(s.charAt(i))) {
                isLower = true;
                break;
            }
        }
        return isLower;
    }


    /* TASK 2: Create a method called noZero();
    This method will take one Integer ArrayList argument, and it will return an ArrayList with all zeros removed from the original Integer ArrayList.
    NOTE: Assume that ArrayList size will be at least 1.
    */
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        /* Iterator<Integer> iterator = numbers.iterator(); // put all elements in a queue
            while (iterator.hasNext()) { // checking if there is any more elements in the queue
                if (iterator.next() == 0) iterator.remove(); // if the next element that comes is equal to 0 then remove all element that meets the condition
            }
            return numbers;
        */

        numbers.removeIf(element -> element == 0);
        return numbers;

        /* for (int i = 0; i < list.size(); i++){
           if (list.get(i) == 0) list.remove(list.get(i));
        }
        return list;
         */
    }


    /*TASK 3: Create a method called numberAndSquare();
    This method will take an int array argument, and it will return a multidimensional array with all numbers squared.
    NOTE: Assume that array size is at least 1.
    */
    public static int[][] numberAndSquare(int[] a){
        int[][] squareArray = new int[a.length][2]; // int[row][column] --> only have to define row to initialize multi-dimensional arrays
        for (int i = 0; i < a.length; i++){
            squareArray[i][0] = a[i];
            squareArray[i][1] = a[i] * a[i];
        }
        return squareArray;
        // NOTE: MUST USE Arrays.deepToStrings(); METHOD TO PRINT OUT MULTI-DIMENSIONAL ARRAY
    }


    /* TASK 4: Create a method called containsValue();
    This method will take a String array and a String argument, and it will return a boolean.
    Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
    NOTE: Assume that array size is at least 1.
    NOTE: The method is case-sensitive
    Hint: Use binarySearch() for easy solution
    */
    public static boolean containsValue(String[] s, String str){
        return Arrays.binarySearch(s, str) >= 0;
    }


    /* TASK 5: Create a method called reverseSentence();
    This method will take a String argument, and it will return a String with changing the place of every word. All words should be in reverse order.
    Make sure that there are two words inside the sentence at least. If there is no two words return “There is not enough words!”.
    NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!
    Hint: Use split() for easy solution
    Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case
    */
    public static String reverseSentence(String s) {
        //String reverse = "";
        StringBuilder sb = new StringBuilder();
        if (!s.trim().contains(" ")) return "There is not enough words!";
        else {
            String[] str = s.trim().split(" ");
           for (int i = str.length-1; i >= 0; i--){
               //reverse += str[i] + " ";
               sb.append(str[i].toLowerCase() + " ");
            }
        }
        return sb.substring(0,1).toUpperCase() +sb.substring(1).trim(); //reverse.trim();
    }


    /* TASK 6: Create a method called removeStringSpecialsDigits()
    This method will take a String as argument, and it will return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.
    */
    public static String removeStringSpecialsDigits(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)) || Character.isWhitespace(s.charAt(i))) str += s.charAt(i);
        }
        return str;
    }


    /* TASK 7: Create a method called removeArraySpecialsDigits();
    This method will take a String array as argument, and it will return a String array without the special characters or digits from the elements.
    NOTE: Assume that array size is at least 1.
    */
    public static String[] removeArraySpecialsDigits(String[] s) {
        int index = 0;
        for (String element : s) {
            s[index++] = element.replaceAll("[^a-zA-Z]", "");
        }
        return s;
    }


    /* TASK 8: Create a method called removeAndReturnCommons();
    This method will take two String ArrayList, and it will return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.
    */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> commonWords = new ArrayList<>();
        for (String s1 : a) {
            for (String s2 : b) {
                if (s1.equals(s2) && !commonWords.contains(s1)) commonWords.add(s1);
            }
        }
        return commonWords;
    }


    /* TASK 9: Create a method called noXInVariables();
    This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
    If the element itself equals to x or X or contains only x letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.
    */
    public static ArrayList<String> noXInVariables(ArrayList<String> s){
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i).toLowerCase().contains("x")){
                s.set(i, s.get(i).replaceAll("(?i)" + "x", "")); // ("[xX]", "")
            }
            s.removeIf(String::isEmpty);
        }
        return s;

        /* for (int i = 0; i < s.size(); i++){
            if(s.get(i).toLowerCase().contains("x")){
                String newS = "";
                for (int j = 0; j < s.get(i).length(); j++){
                    if (!(s.get(i).toLowerCase().charAt(j) == 'x'))  newS += s.get(i).charAt(j);
                }
                s.set(i, newS);
            }
            s.removeIf(e -> e.isEmpty()); //s.removeIf(String::isEmpty);
        }
        return s; */
    }



    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------\n");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("\n-----TASK 2------\n");
        ArrayList<Integer> t2_test1 = new ArrayList<>();
        t2_test1.add(1);
        System.out.println(noZero(t2_test1));
        ArrayList<Integer> t2_test2 = new ArrayList<>();
        t2_test2.add(1);
        t2_test2.add(1);
        t2_test2.add(10);
        System.out.println(noZero(t2_test2));
        ArrayList<Integer> t2_test3 = new ArrayList<>();
        t2_test3.add(0);
        t2_test3.add(1);
        t2_test3.add(10);
        System.out.println(noZero(t2_test3));
        ArrayList<Integer> t2_test4 = new ArrayList<>();
        t2_test4.add(0);
        t2_test4.add(0);
        t2_test4.add(0);
        System.out.println(noZero(t2_test4));

        System.out.println("\n-----TASK 3------\n");
        int[] t3_test1 = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(t3_test1)));
        int[] t3_test2 = {0, 3, 6};
        System.out.println(Arrays.deepToString(numberAndSquare(t3_test2)));
        int[] t3_test3 = {1, 4};
        System.out.println(Arrays.deepToString(numberAndSquare(t3_test3)));

        System.out.println("\n-----TASK 4------\n");
        String[] t4Test1 = {"abc", "foo", "java"};
        System.out.println(containsValue(t4Test1, "hello"));
        String[] t4Test2 = {"abc", "def", "123"};
        System.out.println(containsValue(t4Test2, "Abc"));
        String[] t4Test3 = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue(t4Test3, "123"));

        System.out.println("\n-----TASK 5------\n");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\n-----TASK 6------\n");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("\n-----TASK 7------\n");
        String[] t7_data1 = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(t7_data1)));
        String[] t7_data2 = {"Selenium", "123$%", "###"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(t7_data2)));
        String[] t7_data3 = {"Selenium", "123#$%Cypress"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(t7_data3)));

        System.out.println("\n-----TASK 8------\n");
        ArrayList<String> t8_test1 = new ArrayList<>();
        t8_test1.add("Java");
        t8_test1.add("is");
        t8_test1.add("fun");
        ArrayList<String> t8_test2 = new ArrayList<>();
        t8_test2.add("abc");
        t8_test2.add("xyz");
        t8_test2.add("123");
        System.out.println(removeAndReturnCommons(t8_test1, t8_test2));

        ArrayList<String> t8_test3 = new ArrayList<>();
        t8_test3.add("Java");
        t8_test3.add("is");
        t8_test3.add("fun");
        ArrayList<String> t8_test4 = new ArrayList<>();
        t8_test4.add("Java");
        t8_test4.add("C#");
        t8_test4.add("Python");
        System.out.println(removeAndReturnCommons(t8_test3, t8_test4));

        ArrayList<String> t8_test5 = new ArrayList<>();
        t8_test5.add("Java");
        t8_test5.add("C#");
        t8_test5.add("C#");
        ArrayList<String> t8_test6 = new ArrayList<>();
        t8_test6.add("Python");
        t8_test6.add("C#");
        t8_test6.add("C++");
        System.out.println(removeAndReturnCommons(t8_test5, t8_test6));

        System.out.println("\n-----TASK 9------\n");
        ArrayList<String> t9_test1 = new ArrayList<>();
        t9_test1.add("abc");
        t9_test1.add("123");
        t9_test1.add("#$%");
        System.out.println(noXInVariables(t9_test1));

        ArrayList<String> t9_test2 = new ArrayList<>();
        t9_test2.add("xyz");
        t9_test2.add("123");
        t9_test2.add("#$%");
        System.out.println(noXInVariables(t9_test2));

        ArrayList<String> t9_test3 = new ArrayList<>();
        t9_test3.add("x");
        t9_test3.add("123");
        t9_test3.add("#$%");
        System.out.println(noXInVariables(t9_test3));

        ArrayList<String> t9_test4 = new ArrayList<>();
        t9_test4.add("xyXyxy");
        t9_test4.add("Xx");
        t9_test4.add("ABC");
        System.out.println(noXInVariables(t9_test4));


    }
}
