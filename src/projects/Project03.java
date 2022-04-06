package projects;

public class Project03 {
    public static void main(String[] args) {

    System.out.println("\n-----TASK 1------\n");
    /* PSEUDO CODE FOR TASK ONE:
    1. assume that you are given: String s1 = “24”, s2 = “5”;
    2. find the sum, subtraction, division, multiplication and remainder of s1 and s2
    */
    String s1 = "24", s2 = "5";
    int s1Int = Integer.parseInt(s1), s2Int = Integer.parseInt(s2);
    double s1Dub = Double.parseDouble(s1), s2Dub = Double.parseDouble(s1);

    System.out.println("The sum of " + s1Int + " and " + s2Int + " = " + (s1Int + s2Int));
    System.out.println("The subtraction of " + s1Int + " and " + s2Int + " = " + (s1Int - s2Int));
    System.out.println("The division of " + s1Dub + " and " + s2Dub + " = " + (s1Dub / s2Dub));
    System.out.println("The multiplication of " + s1Int + " and " + s2Int + " = " + (s1Int * s2Int));
    System.out.println("The remainder of " + s1Int + " and " + s2Int + " = " + (s1Int % s2Int));

        System.out.println("\nEND OF THE PROGRAM");

    System.out.println("\n-----TASK 2------\n");
    /* PSEUDO CODE FOR TASK TWO:
    1. generate a random number between 1 and 35 (1 and 35 included)
    2. find if given number is prime
    3. print "THE NUMBER IS A PRIME NUMBER" if the number is prime; else "THE NUMBER IS NOT A PRIME NUMBER"
    NOTE: RANDOM * (END POINT - START POINT + 1) + START POINT
    */
    int random1 = (int)((Math.random() * 35) + 1);
    System.out.println("Random number = " + random1);

    /*if (random1 == 2 || random1 == 3 || random1 ==5 || random1 ==7 ||
            random1 == 11 || random1 == 13 || random1 == 17 || random1 == 19
            || random1 == 23 || random1 == 29 || random1 == 31)
        System.out.println("THE NUMBER IS A PRIME NUMBER");
    else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");*/

    switch (random1){
        case 2:
        case 3:
        case 5:
        case 7:
        case 11:
        case 13:
        case 17:
        case 19:
        case 23:
        case 29:
        case 31:
            System.out.println("THE NUMBER IS A PRIME NUMBER");
            break;
        default:
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
    }

        System.out.println("\nEND OF THE PROGRAM");

    System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    1. generate 3 random number between 1 and 50 (1 and 50 included)
    2. print each number from lowest to greatest
    NOTE: ignore duplicated random numbers
    */
    int randomNum1 = (int)((Math.random() * 50) + 1), randomNum2 = (int)((Math.random() * 50) + 1),
            randomNum3 = (int)((Math.random() * 50) + 1);
    int min = Math.min(Math.min(randomNum1, randomNum2), randomNum3);
    int max = Math.max(Math.max(randomNum1, randomNum2), randomNum3);

    System.out.println("Number 1 = " + randomNum1);
    System.out.println("Number 2 = " + randomNum2);
    System.out.println("Number 3 = " + randomNum3);

    System.out.println("Lowest number is = " + min);

    if (randomNum1 != max && randomNum1 != min){
        System.out.println("Middle number is = " + randomNum1);
    }else if (randomNum2 != max && randomNum2 != min){
        System.out.println("Middle number is = " + randomNum2);
    }else {
        System.out.println("Middle number is = " + randomNum3);
    } // if there are 3 diff possible outcome then you need 3 if-elseif-else

    System.out.println("Greatest number is = " + max);

        System.out.println("\nEND OF THE PROGRAM");

    System.out.println("\n-----TASK 4------\n");
    /* PSEUDO CODE FOR TASK FOUR:
    ASSUME: you are given a single character
    1. check if given char is a letter but not digit or special character
    2. print “Invalid character detected!!!” if given char is not a letter
    3. if it's a letter then find out if it is an uppercase or a lowercase letter
    4. print “The letter is uppercase”, else print “The letter is lowercase”
    */
    char c1 = '5';
   // int c1Int = c1, c2Int = c2, c3Int = c3; NOT NEEDED --> implicit casting is done here bc char = int

    if (c1 >= 65 && c1 <= 90){ // uppercase ---> can also be written as c1 >= 'A' && c1 <= 'Z'
            System.out.println("The letter is uppercase");
        }else if (c1 >= 97 && c1 <= 122){ // lowercase ----> can also be written as c1 >= 'a' && c1 <= 'z'
            System.out.println("The letter is lowercase");
        } else { // char1 <= 64 || (char1 >= 91 && char1 <= 96) || char1 > 122 <-- special & number --> c1Int >= 48 && c1Int <= 57
        System.out.println("Invalid character detected!!!");
    }

        System.out.println("\nEND OF THE PROGRAM");

    System.out.println("\n-----TASK 5------\n");
    /* PSEUDO CODE FOR TASK FIVE:
    ASSUME: you are given a single character
    1. check if given char is a letter but not digit or special character
    2. print “Invalid character detected!!!” if given char is not a letter
    3. if it's a letter then find out whether it is a vowel or a consonant
    4. print “The letter is vowel” if the letter is vowel, else print “The letter is consonant”
    NOTE: Vowel letters = a, e, i, o, u, A, E, I, O, U
    */
    char char1 = 'A';
    // int char1Int = char1, char2Int = char2, char3Int = char3; NOT NEEDED --> implicit casting is done here bc char = int

    if (char1 <= 64 || (char1 >= 91 && char1 <= 96) || char1 > 122){ // <-- special & number --> char1Int >= 48 && char1Int <= 57
            System.out.println("Invalid character detected!!!");
    } else {
        switch (char1) { //vowel
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
                System.out.println("The letter is vowel");
                break; // W/O break; the program will continue print out even after a match has been made
            default: // consonant
                System.out.println("The letter is consonant");
        }
    }

    /* CAN ALSO BE DONE THIS WAY:
    if (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122){
        switch (c1){
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
                System.out.println("The letter is vowel");
                break;
            default:
                System.out.println("The letter is consonant");
    }else {System.out.println("Invalid character detected!!!");}

    OR THIS WAY:
    if (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122){
        if ( c1 == 'a' || c1 == 'e' || c1 == 'i' .. and so on ..){
            System.out.println("The letter is vowel");
        }else System.out.println("The letter is consonant");
    }{System.out.println("Invalid character detected!!!");}
     */



        System.out.println("\nEND OF THE PROGRAM");

    System.out.println("\n-----TASK 6------\n");
    /* PSEUDO CODE FOR TASK SIX:
    ASSUME: you are given a single character
    1. check if the given char is a special character but not a digit or not a letter
    2. if it's a special character then print “Special character is = {givenCharacter}”
    3. else print “Invalid character detected!!!"
    */
    char special1 = '6';
    // int special1Int = special1, special2Int = special2; --> casting not needed bc char=int

    if (special1 >= 48 && special1 <= 57 || special1 >= 65 && special1 <= 90 || special1 >= 97 && special1 <= 122){ // number or letter
        System.out.println("Invalid character detected!!!");
    } else { // special
        System.out.println("Special character is = " + "{" + special1 + "}");
    }

    /* THIS IS A DIFFERENT WAY TOT DO IT:
    if (special1 >= '0' && special1 <= '9' || special1 >= 'A' && special1 <= 'Z' || special1 >= 'a' && special1 <= 'z'){ // number or letter
        System.out.println("Invalid character detected!!!");
    } else { // special
        System.out.println("Special character is = " + "{" + special1 + "}");

    OR THIS WAY:
    if !(special1 >= '0' && special1 <= '9') && !(special1 >= 'A' && special1 <= 'Z') && !(special1 >= 'a' && special1 <= 'z');
        ----> this a way to find that it is a special character first ..
     */

        System.out.println("\nEND OF THE PROGRAM");

    System.out.println("\n-----TASK 7------\n");
    /* PSEUDO CODE FOR TASK SEVEN:
    ASSUME: you are given a single character
    1. check if the given char is a special character but not a digit or not a letter
    2. if given char is a letter then print “Character is a letter”
    3. if given char is a digit then print “Character is a digit”
    4. else print “Character is a special character”
    */
    char letter = '$';
    // int letterInt = letter, numberInt = number, specialInt = special; --> casting not needed bc char=int

    if (letter >= 65 && letter >= 90 || letter >= 97 && letter >= 122){ // letter
        System.out.println("Character is a letter");
    }else if (letter >= 48 && letter <= 57){ // number
        System.out.println("Character is a digit");
    }else { // special
        System.out.println("Character is a special character");
    }
        System.out.println("\nEND OF THE PROGRAM");










    }
}
