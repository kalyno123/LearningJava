package projects;

import utilities.CharacterHelper;

public class TestingCharacterHelper {
    public static void main(String[] args) {

        char c1 = 32 ;
        char c2 = 'c';
        System.out.println("c space = " + CharacterHelper.isSpace(c1));
        System.out.println("c space = " + CharacterHelper.isSpace(c2));

        char c3 = '5' ;
        char c4 = 'Z';
        System.out.println("c digit = " + CharacterHelper.isDigit(c3));
        System.out.println("c digit = " + CharacterHelper.isDigit(c4));

        char c5 = 'T';
        char c6 = 't';
        System.out.println("c uppercase = " + CharacterHelper.isUppercase(c5));
        System.out.println("c uppercase= " + CharacterHelper.isUppercase(c6));

        char c7 = 'a';
        char c8 = 'A';
        System.out.println("c lowercase = " + CharacterHelper.isLowercase(c7));
        System.out.println("c lowercase = " + CharacterHelper.isLowercase(c8));

        char c9 = 'K';
        char c10 = '$';
        System.out.println("c letter = " + CharacterHelper.isLetter(c9));
        System.out.println("c letter = " + CharacterHelper.isLetter(c10));

        char c11 = 'i';
        char c12 = 'g';
        System.out.println("c vowel = " + CharacterHelper.isVowel(c11));
        System.out.println("c vowel = " + CharacterHelper.isVowel(c12));

        char c13 = 'g';
        char c14 = 'i';
        System.out.println("c consonant = " + CharacterHelper.isConsonant(c13));
        System.out.println("c consonant = " + CharacterHelper.isConsonant(c14));


    }
}
