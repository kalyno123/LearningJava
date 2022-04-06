package collections.arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class LoopingThroughArrayListElements {
    public static void main(String[] args) {

        /* ARRAYLIST SYNTAX:
         ArrayList<referenceDataType> varName = new ArrayList<>();
         List<referenceDataType> varName = new ArrayList<>();
        */
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');

        System.out.println("My list before sort = " + chars);
        Collections.sort(chars);
        System.out.println("My list before sort = " + chars);

        //PRINTING EACH ELEMENT WITH LOOPS:
        chars.get(0); // A
        chars.get(1); // B
        chars.get(2); // C
        chars.get(3); // D

        //FOR-I LOOP:
        for (int i = 0; i < chars.size(); i++){
            System.out.println(chars.get(i));
        }
        //FOR-EACH LOOP:
        for (Character element : chars){
            System.out.println(element);
        }








    }
}
