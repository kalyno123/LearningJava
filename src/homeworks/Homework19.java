package homeworks;

import java.util.Arrays;

public class Homework19 {
    /* TASK 1:
    Create a method called noDigit()
    This method will take one String argument, and it will return a new String with all digits removed from the original String
    */
    public static String noDigit(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))) str += s.charAt(i);
        }
        return str;
    }

    public static String noNumber(String s){
        return s.replaceAll("[\\d]","");
    }

    /* TASK 2:
    Create a method called noVowel()
    This method will take one String argument, and it will return a new String with all vowels removed from the original String
    */
    public static String noVowel(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++){
            if (!(s.toLowerCase().charAt(i) == 'a' ||  s.toLowerCase().charAt(i) == 'e' ||  s.toLowerCase().charAt(i) == 'i' ||
                    s.toLowerCase().charAt(i) == 'o' ||  s.toLowerCase().charAt(i) == 'u')) str += s.charAt(i);
        }
        return str;
    }

    public static String noVowels(String s){
        return s.replaceAll("[aeiouAEIOU]","");
    }

    /* TASK 3:
    Create a method called sumOfDigits()
    This method will take one String argument, and it will return an int sum of all digits from the original String.
    NOTE: Return zero if there is no digits in the String
    */
    public static int sumOfDigits(String s){
        int sum = 0;
        char[] c = s.toCharArray();

        for (char element : c){
            if (Character.isDigit(element)) {
                sum += Integer.parseInt(String.valueOf(element));
            }
        }
        return sum;
    }

    public static int sumDigits(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))   {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return sum;
    }


    /* TASK 4:
    Create a method called hasUpperCase()
    This method will take one String argument, and it will return boolean true if there is an uppercase letter and false otherwise.
    */
    public static boolean hasUpperCase(String s){
        boolean hasUpper = false;
        char[] c = s.toCharArray();

        for (char element : c){
            if (Character.isUpperCase(element)) {
                hasUpper = true;
                break;
            }
        }
        return hasUpper;
    }

    /* TASK 5:
    Create a method called middleInt()
    This method will take three int arguments, and it will return the middle int.
    */
    public static int middleInt(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        if (a == b && b == c) return a;
        else if (a == b) return a;
        else if (a != max && a != min) return a;
        else if (b != max && b != min) return b;
        else return c;
    }

    /* TASK 6:
    Create a method called no13()
    This method will take an int array as argument, and it will return a new array with all 13 replaced with 0.
    NOTE: Assume length will always be more than zero.
    */
    public static int[] no13(int[] a){
        String[] s = new String[a.length];
        int index = 0;
        for(int element : a){
            s[index++] = "" + element;
        }

        index = 0;
        for(String element : s){
            a[index++] = Integer.parseInt(element.replaceAll("13", "0"));
        }
        return a;
    }

    public static int[] noThirteen(int[] a){
        int index = 0;
        for (int element : a){
            if (element == 13) a[index++] = 0;
        }
        return a;
    }


    /* TASK 7:
    Create a method called arrFactorial()
    This method will take an int array as argument, and it will return the array with every number replaced with their factorials.
    NOTE: Assume length will always be more than zero.
    NOTE: 0! is equals to 1
    */
    public static int[] arrFactorial(int[] a){
        for (int i = 0; i <a.length; i++){
            int factorial = 1;
            for (int j = a[i]; j >= 2; j--){
                factorial *= j;
            }
            a[i] = factorial;
        }
        return a;
    }


    /* TASK 8:
    Create a method called categorizeCharacters()
    This method will take String as an argument and return a String array as letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES
    NOTE: Assume length will always be more than zero.
    */
    public static String[] categorizeCharacters(String s){
        String[] arr = new String[3];

        String letter = "";
        String digit = "";
        String special = "";

        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))) letter += s.charAt(i);
            else if (Character.isDigit(s.charAt(i))) digit += s.charAt(i);
            else if (!(Character.isLetterOrDigit(s.charAt(i)) && Character.isWhitespace(s.charAt(i)))) special += s.charAt(i);
        }

        arr[0] = letter;
        arr[1] = digit;
        arr[2] = special;

        return arr;
    }

    public static String[] categorizeChars(String str){
        String[] catg = {"", "", ""};

        for (char character : str.toCharArray()) {
            if (Character.isLetter(character)) catg[0] += character + "";
            else if (Character.isDigit(character)) catg[1] += character + "";
            else catg[2] += character + "";
        }

        return catg;
    }


    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------\n");
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));

        System.out.println(noNumber(""));
        System.out.println(noNumber("Java"));
        System.out.println(noNumber("123Hello"));
        System.out.println(noNumber("123Hello World149"));
        System.out.println(noNumber("123Tech456Global149"));

        System.out.println("\n-----TASK 2------\n");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));

        System.out.println(noVowels(""));
        System.out.println(noVowels("xyz"));
        System.out.println(noVowels("JAVA"));
        System.out.println(noVowels("125$"));
        System.out.println(noVowels("TechGlobal"));

        System.out.println("\n-----TASK 3------\n");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John's age is 29"));
        System.out.println(sumOfDigits("$125.0"));

        System.out.println(sumDigits(""));
        System.out.println(sumDigits("Java"));
        System.out.println(sumDigits("John's age is 29"));
        System.out.println(sumDigits("$125.0"));

        System.out.println("\n-----TASK 4------\n");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John's age is 29"));
        System.out.println(hasUpperCase("$125.0"));

        System.out.println("\n-----TASK 5------\n");
        System.out.println(middleInt(1, 1, 1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt( -1, 25, 10));

        System.out.println("\n-----TASK 6------\n");
        int[] test1 = {1, 2, 3 ,4};
        System.out.println(Arrays.toString(no13(test1)));
        System.out.println(Arrays.toString(noThirteen(test1)));

        int[] test2 = {13, 2, 3 };
        System.out.println(Arrays.toString(no13(test2)));
        System.out.println(Arrays.toString(noThirteen(test2)));

        int[] test3 = {13, 13, 13 , 13, 13};
        System.out.println(Arrays.toString(no13(test3)));
        System.out.println(Arrays.toString(noThirteen(test3)));

        System.out.println("\n-----TASK 7------\n");
        int[] test4 = {1, 2, 3 ,4};
        System.out.println(Arrays.toString(arrFactorial(test4)));

        int[] test5 = {0, 2, 4 , 1};
        System.out.println(Arrays.toString(arrFactorial(test5)));

        int[] test6 = {5 , 0, 6};
        System.out.println(Arrays.toString(arrFactorial(test6)));

        System.out.println("\n-----TASK 8------\n");
        System.out.println(Arrays.toString(categorizeCharacters("     ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));


    }
}
