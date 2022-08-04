package homeworks;

import java.util.HashMap;
import java.util.Map;

public class MOCK {
    /* Assume that you are given some product names and their prices as below:
     Pen, 5.99
     Book, 20.99
     NoteBook, 20.98
     Pencil, 9.99

     Write a method that returns the most expensive product with below message:
     Expected: Book is the most expensive and the price is $20.99.
     */
    public static String mostExpensive(Map<String, Double> products) {
        double maxPrice = 0.0; // container to hold max price
        String maxItem = ""; // container for the maxed priced item

        // looping thur the keys of the map; products.keySet() --> put all the keys into a set
        for (String item : products.keySet()) { // ex: [pen, book, notebook, pencil]
            if (products.get(item) > maxPrice) { // products.get(item) --> get() return the value of the key passed in
                // ^^ here is checking if the value of that key that comes is bigger than the maxPrice value
                maxPrice = products.get(item); // if it is greater than then reassign the value price tp maxPrice
                maxItem = item; // and then take that key(item) and reassign it to the maxItem container
            }
        }
        return maxItem + " is the most expensive and the price is $" + maxPrice + ".";
    }

    public static void main(String[] args) {
        //Map<String, Double> products = new HashMap<>();
        //products.put("Pen", 5.99);
        //products.put("Book", 20.99);
        //products.put("NoteBook", 20.98);
        //products.put("Pencil", 9.99);
//
        //System.out.println(mostExpensive(products)); //Book is the most expensive and the price is 20.99.


        // ------------------------------------------

        String str = "Apple Banana Apple Orange Kiwi Apple Kiwi";
        System.out.println(countOccurance(""));
        System.out.println(countOccurance(str));

        //System.out.println(Q18("java is fun"));


        String str = "Java is fun";
        //String str = "Today is a fun day";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        //System.out.println(reverse); // nuf si avaJ

        String[] reserve2 = reverse.split(" "); //[nuf, si, avaJ]
        String reverseAgain = "";
        for (int i = reserve2.length - 1; i >= 0; i--) {
            reverseAgain += reserve2[i] + " ";
        }
        System.out.println(reverseAgain.trim());

        String string = "Java is fun";
        String[] opposite = string.split(" "); // [java, is, fun]
        for (int i = 0; i < opposite.length; i++){
            for (int j = opposite[i].length() - 1; j >= 0; j--) {
                System.out.print(opposite[i].charAt(j));
            }
            System.out.print(" ");
        }


    /* Write a method called as calculateTotalPrice1();
    which takes a Map of some shopping items with their amounts and calculates the total prices as double.
    Item prices are given below:
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    Pineapple = $5.25

    Test Data 1:                Test Data 2:
    {Apple=3, Mango = 1}        {Apple=2, Pineapple = 1, Orange=3}
    Expected Output 1:          Expected Output 2:
    10.99                       19.12

    /* MAP METHODS:
 containsKey(Key) --> This method is used to check if a particular key is in the Map or not.
 It takes the key as a parameter and returns True if that element is mapped in the map.
 containsValue(Value) --> This method is used to check if a particular value is mapped by one or more key in the Map.
 It takes the value as a parameter and returns True if that value is mapped by any of the key in the map.
 entrySet() --> This method is used to create a set of the keys+values pairs contained in the map.
 It basically returns a set view of the map's key+values.
 get(Key) --> This method is used to get the value of a particular key passed as parameter.
 It returns NULL when the map contains no such key.
 keySet() --> This method is used to return a Set view of the keys contained in this map.
 (The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.)
 put(Key, Value)    --> This method is used to assign the specified value with the specified key in this map.
 replace(Key, Value) --> This method replaces the value of the specified key only if the key is previously mapped with some value.
 This method returns the previous value associated with the specified key. If there is no such key mapped, then it returns null.
 */
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 2.00);
        fruitPrices.put("Orange", 3.29);
        fruitPrices.put("Mango", 4.99);

        Map<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Apple", 3);
        fruitCount.put("Mango", 1);

        double totalPrice = 0; // [Apple, Mango]
        for (String fruit : fruitCount.keySet()) { // This method is used to return a Set view of the keys contained in this map ex: {apple,orange,mango}
            totalPrice += fruitPrices.get(fruit) * fruitCount.get(fruit);
        }
        System.out.println(totalPrice);


        //System.out.println(fruitPrices.entrySet()); // entrySet() --> this method takes the key and values of the map and puts it on a set

    }

    // VITA'S APPROACH:
    public static String leastNeededProduct(Map<String, Integer> map) {
        int min = Integer.MAX_VALUE;
        String myValue = "";
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            if (s.getValue() < min) {
                min = s.getValue();
                myValue = s.getKey();
            }
        }
        return myValue + " is the least needed and quantity is " + min;
    }


    public static String removeDup(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (!s.contains(str.charAt(i) + " ")) s += str.charAt(i) + " ";
        }
        return s;
    }

    /*
    Requirement:
    -Student is responsible to create a main method and test their method.
    -Write a method that takes an array of String and returns the count of each unique element in the array as a Map
    Test Data:
    "Apple Banana Apple Orange Kiwi Apple Kiwi"
    Expected:
     {Apple=3, Orange=1, Kiwi=2, Banana=1}
     */
    public static HashMap<String, Integer> countOccurance(String str) {
        HashMap<String, Integer> newMap = new HashMap<>(); // container for the key+value pairs of the word and # of occurrences
        if (str.length() < 1) // checking if the string length
            return newMap;
        else {
            for (String s : str.toLowerCase().split(" ")) {
                if (!newMap.containsKey(s)) newMap.put(s, 1);
                else newMap.put(s, newMap.get(s) + 1);
            }
        }
        return newMap;
    }

    /* MAP METHODS:
    containsKey(Key) --> This method is used to check if a particular key is in the Map or not.
    It takes the key as a parameter and returns True if that element is mapped in the map.

    containsValue(Value) --> This method is used to check if a particular value is mapped by one or more key in the Map.
    It takes the value as a parameter and returns True if that value is mapped by any of the key in the map.

    entrySet() --> This method is used to create a set of the keys+values pairs contained in the map.
    It basically returns a set view of the map's key+values.

    get(Key) --> This method is used to get the value of a particular key passed as parameter.
    It returns NULL when the map contains no such key.

    keySet() --> This method is used to return a Set view of the keys contained in this map.
    (The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.)

    put(Key, Value)	--> This method is used to assign the specified value with the specified key in this map.

    replace(Key, Value) --> This method replaces the value of the specified key only if the key is previously mapped with some value.
    This method returns the previous value associated with the specified key. If there is no such key mapped, then it returns null.
    */

    public static String Q18(String str){
        // "java is fun"
        String first = str.substring(0, str.indexOf(" ")); // java
        String middle = str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")); // is
        String last = str.substring(str.lastIndexOf(" ")+1); // fun
        return last + " " + middle + " " + first;
    }




}
