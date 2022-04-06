package collections.arrayLists;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList; // SHORTCUT FOR IMPORT IS (MAC: OPTION + ENTER)
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        //1. DECLARING AN ARRAY VS ARRAYLIST
        String[] namesArray = new String[5];

        ArrayList<String> namesList = new ArrayList<>(); // INSIDE FIRST <> INSERT REFERENCE DATA TYPE

        System.out.println("\n-----HOW TO PRINT THE SIZE------\n");
        //2. HOW TO PRINT THE SIZE OF ARRAY VS ARRAYLIST:
        System.out.println("Size of the Array = " + namesArray.length); // 5
        System.out.println("Size of the Array = " + namesList.size()); // 0
        // size(); Method is a non-static, and it doesn't take any arguments. It's a return type, and it returns an int-index.

        //3. HOW TO ADD ELEMENTS TO ARRAY VS ARRAYLIST:
        namesArray[0] = "Abe";
        namesArray[4] = "Data";
        //namesArray[6] = "Kaly"; ---> java.lang will throw 'ArrayIndexOutOfBoundException' -- runtime error

        namesList.add("Abe"); // [Abe]
        namesList.add(1, "Data"); // [Abe, Data]
        namesList.add(1, "John"); // [Abe, John, Data]
        namesList.add("Alona"); // [Abe, John, Data, Alona]
        namesList.add(0, "James"); // [James, Abe, John, Data, Alona]
        //namesList.add(4, "Kaly"); ---> java.lang will throw 'IndexOutOfBoundException' -- runtime error

        /* add(); Method is non-static, and it is an overloaded method.
        1) add(element); = it takes objects as an argument. is a return type, and it returns boolean.
        2) add(index, element); = it takes 2 parameters (int-index - position of the added element, object - the element to be added). it is a void type.
        add(); will add the element at the specified index and shift every element after that over +1 index. if index isn't specified then it'll just add the new element to the end.
        */

        namesList.set(2, "Lionel"); // [Abe, John, Lionel]
        // set(); Method (used to change/swap element) is non-static, and takes 2 arguments which is the index and Object you want to add to the set (int-index, Object). It is return type, and it returns a String.

        System.out.println("\n-----HOW TO PRINT ARRAY + ARRAYLIST------\n");
        //4. HOW TO PRINT ARRAY VS ARRAYLIST:
        System.out.println(Arrays.toString(namesArray)); // [Abe, null, null, null, Data]

        System.out.println(namesList); // [James, Abe, Lionel, Data, Alona]

        namesList.add("Anderi");
        System.out.println(namesList);// [James, Abe, Lionel, Data, Alona, Anderi]

        namesList.add(5, "Taylor");
        System.out.println(namesList); // [James, Abe, Lionel, Data, Alona, Taylor, Anderi]

        namesList.set(3, "Daria");
        System.out.println();

        namesList.add(null); // reserving a null(blank/empty) element
        System.out.println(namesList); // [James, Abe, Lionel, Daria, Alona, Taylor, Anderi, null]

        System.out.println("\n-----HOW TO REMOVE ELEMENTS ARRAYLIST------\n");
        //5. HOW TO REMOVE ELEMENTS ARRAYLIST:

        /* REMOVE() AND REMOVEALL() METHOD:
        namesList.remove(7); ---> this will remove element at given int-index.
        namesList.remove("James"); ---> this will remove the specified Object.
        namesList.removeAll(); ---> args: collection of elements to be removed. this will remove all the element from the given collection.
        */

        namesList.remove(0); // James is removed from ArrayList
        System.out.println(namesList); // [Abe, Lionel, Daria, Alona, Taylor, Anderi, null]
        System.out.println(namesList.remove(2)); // Daria is removed from ArrayList
        System.out.println(namesList); // [Abe, Lionel, Alona, Taylor, Anderi, null]

        //namesList.remove(20);  ---> java.lang will throw 'IndexOutOfBoundException'

        namesList.remove("Alona"); // Alona is removed from ArrayList
        System.out.println(namesList); // [Abe, Lionel, Taylor, Anderi, null]

        System.out.println(namesList.remove("John"));
        System.out.println(namesList);

        System.out.println(namesList.remove("max")); // false -- when object doesn't exist then it'll return false
        System.out.println(namesList.remove("Melda")); // false
        System.out.println(namesList); // [Abe, Lionel, Taylor, Anderi, null] -- nothing was removed since above elements didn't exist in collection

        System.out.println("\n-----HOW TO INVOKE ELEMENTS IN ARRAYLIST------\n");
        //6. HOW TO INVOKE ELEMENTS IN ARRAYLIST:

        System.out.println(namesList.get(0)); // Abe
        System.out.println(namesList.get(1)); // Lionel

        System.out.println("\n-----HOW TO GET INDEX OF ELEMENTS IN ARRAYLIST------\n");
        //7. HOW TO GET INDEX OF ELEMENTS IN ARRAYLIST:

        System.out.println(namesList.indexOf("Taylor")); // index: 2
        System.out.println(namesList.indexOf("Abe")); // index: 0
        System.out.println(namesList.indexOf("anderi")); // -1 --> when an element doesn't exist it'll return -1

        System.out.println("\n-----HOW TO CLEAR ALL ELEMENTS IN ARRAYLIST:------\n");
        //8. HOW TO CLEAR ALL ELEMENTS IN ARRAYLIST:

        namesList.clear();
        System.out.println(namesList.size()); // 0 --- the size is zero now since all elements been cleared







    }
}
