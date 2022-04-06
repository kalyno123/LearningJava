package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {

    /* TASK-1
    Write a program that counts spaces for below String
    String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
    Expected result:
    9
    */
        System.out.println("\n---TASK-1---\n");
        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int spaceCounter = 0;
        for (int i = 0; i < address1.length(); i++) {
            if (address1.charAt(i) == ' ')
                spaceCounter++; // when counting something then it's the container++; when sum then container += i
        }
        System.out.println(spaceCounter);

    /* TASK-2
    Write a program that counts letters for below String.
    String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
    Expected result:
    25
    */
        System.out.println("\n---TASK-2---\n");
        String address2 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int letterCounter = 0;
        for (int i = 0; i < address2.length(); i++) {
            if (Character.isLetter(address2.charAt(i))) // charAt(i) --> checking each letter one by one
                letterCounter++; // when counting something then it's the container++; when sum then container += i
        }
        System.out.println(letterCounter);

    /* TASK-3
    Write a program that counts uppercase and lowercase letters for below String.
    Then, find the difference between lowercase letters and uppercase letters
    Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
    String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
    Expected result:
    9
    */
        System.out.println("\n---TASK-3---\n");
        String address3 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        // FIRST WAY:
        int counterA = 0, counterB = 0;
        for (int i = 0; i < address3.length(); i++) {
            if (Character.isUpperCase(address3.charAt(i)))
                counterA++;
            else if (Character.isLowerCase(address3.charAt(i)))
                counterB++;
        }
        System.out.println(Math.abs(counterA - counterB));

        //SECOND WAY:
        int counter = 0;
        for (int i = 0; i < address3.length(); i++) {
            if (Character.isUpperCase(address3.charAt(i)))
                counter++;
            else if (Character.isLowerCase(address3.charAt(i)))
                counter--;
        }
        System.out.println(Math.abs(counter));

        // AKIN'S WAY: (BEST WAY PERFORMANCE WISE)
        int count = 0;
        for (int i = 0; i < address3.length(); i++) {
            if(Character.isLetter(address3.charAt(i))){
                // with each iteration it'll check if the char is a letter first before checking if it's upper/lower
                if(Character.isUpperCase(address3.charAt(i))) count++;
                else count--;
            }
        }
        System.out.println(Math.abs(count));

    /* TASK-4
    Write a program that counts vowel and consonants letters for below String. Then, print them with below messages.
    String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
    Expected result:
    Vowels = 10
    Consonants = 15
    */
        System.out.println("\n---TASK-4---\n");
        String address4 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int countV = 0, countC = 0;
        for (int i = 0; i < address3.length(); i++) {
            if(Character.isLetter(address3.charAt(i)))
                if (CharacterHelper.isVowel(address4.charAt(i))) countV++;
                else  countC++;
        }
        System.out.println("Vowels = " + countV);
        System.out.println("Consonants = " + countC);

    /* TASK-5 - Putting it all together
    Write a program that counts specific types characters from the below String. Then, print them with below messages.
    String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
    Expected result:
    Letters = 25
    LowerCases = 17
    UpperCases = 8
    Vowels = 10
    Consonants = 15
    Digits = 12
    Even = 9
    Odd = 3
    Spaces = 9
    Specials = 2  */
        System.out.println("\n---TASK-5---\n");
        String address5 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int countLetter = 0, countLowercase = 0, countUppercase = 0, countVowels = 0, countConsonants = 0,
                countDigits = 0, countSpaces = 0, countSpecials = 0, countEven = 0, countOdd = 0;

        for (int i = 0; i < address5.length(); i++){
            if(Character.isLetter(address5.charAt(i))){ countLetter++;
                if (CharacterHelper.isVowel(address5.charAt(i))) countVowels++;
                else countConsonants++; //(CharacterHelper.isConsonant(address5.charAt(i)))
                if (Character.isUpperCase(address5.charAt(i))) countUppercase++;
                else countLowercase++; //(Character.isLowerCase(address5.charAt(i)))
            }else if (Character.isDigit(address5.charAt(i))){ countDigits++;
                if (Integer.parseInt("" + address5.charAt(i)) % 2 == 0) countEven++;
                // explicit casting: from char to int but parseInt only takes Strings so have to cast char to String
                else countOdd++; //(Integer.parseInt("" + address5.charAt(i)) % 2 != 0)
            }else if (Character.isSpaceChar(address5.charAt(i))) countSpaces++;
            else countSpecials++;
        }
        System.out.println("Letter = " + countLetter + "\nLowercase = " + countLowercase + "\nUppercase = " + countUppercase +
                "\nVowels = " + countVowels + "\nConsonants = " + countConsonants +
                "\nDigits = " + countDigits + "\nEven = " + countEven + "\nOdd = " + countOdd +
                "\nSpaces = " + countSpaces + "\nSpecials = " + countSpecials);









    }
}
