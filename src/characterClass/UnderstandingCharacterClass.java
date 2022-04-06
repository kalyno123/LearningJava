package characterClass;

import utilities.CharacterHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {

       boolean b = Character.isLetter('a');
       System.out.println(b); // true
       // BETWEEN THE TWO, THE RESULTS WILL RETURN THE SAME
       char c = 'a';
       System.out.println(c); // true

        System.out.println(Character.isUpperCase('b')); // false
        System.out.println(Character.isUpperCase('B')); // true

        System.out.println(Character.isLowerCase('c')); // true
        System.out.println(Character.isLowerCase('C')); // false

        System.out.println(Character.isDigit(9)); // true
        System.out.println(Character.isLetter('k')); // true
        System.out.println(Character.isLetterOrDigit('$')); // false

        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isSpaceChar(' ')); // true

        // ** HOW DO YOU FIND IF THE GIVEN CHAR IS A SPECIAL CHARACTER? : **
        char c1 = '$';
        System.out.println(!Character.isLetterOrDigit(c1) && !Character.isSpaceChar(c1));

        //  ** HOW DO YOU FIND IF THE GIVEN CHAR IS A VOWEL? : **
        char c3 = 'A';
        String str = "AEIOUaeiou";
        // 1st WAY
        System.out.println(c3 == 'a' || c3 == 'e' || c3 == 'i' || c3 == 'o' || c3 == 'u' ||
                c3 == 'A' || c3 == 'E' || c3 == 'I' || c3 == 'O' || c3 == 'U');
        // 2ND WAY
        System.out.println(CharacterHelper.isVowel(c3));
        // 3RD WAY
        System.out.println(str.contains("" + c3)); // ("" + c3) --> String.valueOf(c3)
        // 4TH WAY
        char c4 = 'a';
        boolean isC4Vowel = false; //start w/ false so when the loop runs and the condition becomes true then the loop will end/break
        for(int i = 0; i < str.length(); i++){
            if (c4 == str.charAt(i)) {
                isC4Vowel = true; // condition to terminate the loop
                break; // add a break here bc as soon as 1st iteration is true then break the loop
            }
        }
        if (isC4Vowel) System.out.println("c4 is a vowel");
        else System.out.println("c4 is a vowel");








    }
}
