package utilities;

public class CharacterHelper {

    // ** CLASS NAME CHARACTER ALREADY HAVE DIGIT, LETTER, UPPER, LOWER, SPACE, ETC. EXPECT VOWEL AND CONSONANT. **


    /* PSEUDO CODE FOR TASK ONE:
    1. Create a method called isSpace()
    2. It should be public, static, and return type (returning boolean) with char argument
    3. It should return true if the given char is space, return false if the given char is not a space
    */
    public static boolean isSpace(char c){
        return c == 32;
    }

    /* PSEUDO CODE FOR TASK TWO:
    1. Create a method called isDigit()
    2. It should be public, static, and return type (returning boolean) with char argument
    3. It should return true if the given char is a digit, return false if the given char is not a digit
    NOTE: Digits are represented from 48 to 57 in the ASCII Table
    */
    public static boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }

    /* PSEUDO CODE FOR TASK THREE:
    1. Create a method called isUppercase()
    2. It should be public, static, and return type (returning boolean) with char argument
    3. It should return true if the given char is an uppercase letter, return false if the given char is not an uppercase letter
    NOTE: Digits are represented from 65 to 90 in the ASCII Table
    */
    public static boolean isUppercase(char c){
        return c >= 'A' && c <= 'Z';
    }

    /* PSEUDO CODE FOR TASK FOUR:
    1. Create a method called isLowercase()
    2. It should be public, static, and return type (returning boolean) with char argument
    3. It should return true if the given char is a lowercase, return false if the given char is not a lowercase letter
    NOTE: Digits are represented from 97 to 122 in the ASCII Table
    */
    public static boolean isLowercase(char c){
        return c >= 'a' && c <= 'z';
    }

    /* PSEUDO CODE FOR TASK FIVE:
    1. Create a method called isLetter()
    2. It should be public, static, and return type (returning boolean) with char argument
    3. It should return true if the given char is a letter, return false if the given char is not a letter
    NOTE: Digits are represented from 97 to 122 in the ASCII Table
    */
    public static boolean isLetter(char c){
        return isLowercase(c) || isUppercase(c);
    }
    // when it is static and you're within the same class dont have to invoke using class name

    /* PSEUDO CODE FOR TASK SIX:
    1. Create a method called isVowel()
    2. It should be public, static, and return type (returning boolean) with char argument
    3. It should return true if the given char is a vowel letter, return false if the given char is not a vowel letter
    NOTE: Vowel letters are A,E,O,U,I,a,e,o,u,i
    */

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static boolean isVowel(String c) {
        return c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") ||
                c.equals("A") ||c.equals("E") || c.equals("I") || c.equals("O") || c.equals("U");
    }
    /* public static boolean isVowel(char c) {
        switch (c) { //vowel
            case 97: // a --> can put 97 or 'a'
            case 101: // e
            case 105: // i
            case 111: // o
            case 117: // u
            case 65: // A
            case 69: // E
            case 73: // I
            case 79: // O
            case 85: // U
                return true;
            default:
                return false;
        }
    } */

    /* PSEUDO CODE FOR TASK SEVEN:
    1. Create a method called isConsonant()
    2. It should be public, static, and return type (returning boolean) with char argument
    3. It should return true if the given char is a consonant letter, return false if the given char is not a consonant letter
    NOTE: Consonant letters are any number represented from 65 to 90 and from 97 to 122 in the ASCII Table
    but not vowels (A,E,O,U,I,a,e,o,u,i) or specials etc.
    */
    public static boolean isConsonant(char c){
        return isLetter(c) && !isVowel(c);
    }

    /*
    public static boolean isConsonant(char c){
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U';
    }

    public static boolean isConsonant(char c){
        switch (c) { //vowel
            case 97: // a --> can put 97 or 'a'
            case 101: // e
            case 105: // i
            case 111: // o
            case 117: // u
            case 65: // A
            case 69: // E
            case 73: // I
            case 79: // O
            case 85: // U
                return false;
            default:
                return true;
        }
    }   */


}
