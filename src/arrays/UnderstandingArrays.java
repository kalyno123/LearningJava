package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        //HOW TO STORE ONE STUDENT'S INFO:
        String name;

        name = "John";
        int age1 = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age1);

        // THIS IS NOT HOW TO STORE MULTIPLE DATA:
        String studentsName = "Alex, Abe, Yakeen";
        String age = "20, 21, 22";

        // THIS IS HOW TO STORE MULTIPLE DATAS IN AN ARRAY:
        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22};
        char[] favCharacters = {'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};
        // YOU CANNOT STORE DIFFERENT DATA TYPES IN THE SAME ARRAY.

        // HOW TO PRINT ARRAY:
        System.out.println(names); // wrong way; [Ljava.lang.String;@1540e19d - Location where your collection is stored

        System.out.println(Arrays.toString(names)); // right way; --> [Alex, Abe, Yakeen]
        // ARRAY IS STATIC; MUST BE INVOKED USING ITS CLASS NAME

        // HOW TO GET A SINGLE ELEMENT FROM ARRAY:
        //FIRST WAY -- by storing:
        String nameAt1 = names[1];
        System.out.println(nameAt1); // Abe
        //SECOND WAY
        System.out.println(names[0]); // Alex

        //System.out.println(names[5]); // WHEN AN ELEMENT DOESN'T EXIST JAVA WILL THROW: ArrayIndexOutOfBoundsException

        // HOW TO UPDATE AN ELEMENT -> Abe-> Abraham
        names[1] = "Abraham";
        System.out.println(Arrays.toString(names)); //[Alex, Abraham, Yakeen]

        //HOW TO LOOP ARRAY USING FOR-I LOOP
        for (int i = 0; i <= 2; i++) {// 2, in the case, represents the number of elements or length(size) of the array
            System.out.println(names[i] + " 's age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");
        }



    }
}
