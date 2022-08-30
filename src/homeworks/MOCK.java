package homeworks;

import java.util.*;

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
        String str = "automation";
        //char[] carr = str.toCharArray(); // [a,u,t,o,m,a,t,i,o,n]
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    System.out.println(str.charAt(i));
                }
            }
        }

        //for (int i = 0; i < carr.length; i++){
        //    for (int j = i+1; j < carr.length; j++){
        //        if (carr[i] == carr[j]){ //
        //            System.out.println(carr[i]);
        //        }
        //    }
        //}

        int length = str.length();
        while (length > 0) {
            String letter = String.valueOf(str.charAt(0));
            str = str.replaceAll(letter, "");
            int parseLength = str.length();
            if (parseLength != length - 1) System.out.println(letter);
            length = parseLength;
        }


        int[] arr = {9, 4, 8, 2, 7};
        int target = 11;
        String sumPairs;

        for (int i = 0; i < arr.length; i++) {
            sumPairs = "";
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    sumPairs += "(" + arr[i] + ",";
                    sumPairs += arr[j] + ")";
                    System.out.println(sumPairs);
                }
            }
        }

        //String ss = "chriskaly";
        //String sss = "";
        String palindrome = "civic";
        String result = "";
        for (int i = palindrome.length()-1; i >= 0; i--){
            //sss += ss.charAt(i);
            result += palindrome.charAt(i);
        }
        //System.out.println(sss);
        System.out.println(palindrome.equals(result));

        System.out.println("anagram");
        String one = "mila";
        String two = "liamm";
        if (one.length() != two.length()) {
            System.out.println("false");
        }else {
            char[] onee = one.toCharArray();
            char[] twoo = two.toCharArray();
            Arrays.sort(onee);
            Arrays.sort(twoo);
            System.out.println(Arrays.equals(onee, twoo));
        }

        char c = 'A';
        switch (c){
            case 'A':
                System.out.println("a");
                //break;
            case 'B':
                System.out.println("b");
                //break;
            case 'C':
                System.out.println("c");
                //break;
            default:
                System.out.println("none");
        } // there's no break statement so the expected output should be --> A B C none

        char c1 = 'A', c2 = 'B';
        System.out.println(c1 + c2); // the output would be the ASCII values of each letter added together --> 131
        //String.valueOf(c1) + c2) --> AB


        int[] arrr = {1,9,10,7,2};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int element : arrr){
            if (element > max) max = element;
        }

        for (int element : arrr){
            if (element > secondMax && element != max) secondMax = element;
        }
        System.out.println(max); //10
        System.out.println(secondMax); //9

        System.out.println("totalPrice");
        HashMap<String, Integer> fruitQuanity = new HashMap<>();
        fruitQuanity.put("Apple", 2);
        fruitQuanity.put("Pineapple", 1);
        fruitQuanity.put("Orange", 3);
        System.out.println(calculateTotalPrice(fruitQuanity));

        //Map<String, Double> products = new HashMap<>();
        //products.put("Pen", 5.99);
        //products.put("Book", 20.99);
        //products.put("NoteBook", 20.98);
        //products.put("Pencil", 9.99);
//
        //System.out.println(mostExpensive(products)); //Book is the most expensive and the price is 20.99.


        // ------------------------------------------

        //String str = "Apple Banana Apple Orange Kiwi Apple Kiwi";
       // System.out.println(countOccurance(""));
        //System.out.println(countOccurance(str));

        //System.out.println(Q18("java is fun"));


        //String str = "Java is fun";
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

        System.out.println("\nSumBigNumber");
        String s2 = "ab110c045d";
        System.out.println(findSumNumbers(s2));
        System.out.println(findBiggestNum(s2));

        int n1 = 0, n2 = 1, n3, n = 7;
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = n1;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(Arrays.toString(array)); // [0, 1, 1, 2, 3, 5, 8]


        // ** FIND THE LENGTH WITH THE MOST REPEATED NUMBER **
        int[] abe = {1,1,1,0,1,1,1,1};
        String empty = "";

        for (int i = 0; i <abe.length; i++) {
            empty += abe[i]; // "11101111"
        }

        String[] empty2 = empty.split("0"); // [111, 1111]
        int maxLength = 0;

        for (int i = 0; i < empty2.length; i++) {
            if(empty2[i].length() > 0)
                maxLength = empty2[i].length();
        }
        System.out.println(maxLength);

        // ** COUNT THE OCCURRENCES IN STRING AND THEN SORT THE NUMBER OF OCCURRENCE IN DESCENDING ORDER **
        String sample = "As woodchuck as wood as woodchuck wood as chuck wood ";
        /* EXPECTED:
        as = 4
        wood = 3
        woodchuck = 2
        chuck = 1
        */

        String[] veeArr = sample.toLowerCase().split(" ");
        HashMap<String,Integer> answer = new HashMap<>();

        for(String word : veeArr){
            if(!answer.containsKey(word)) answer.put(word, 1);
            else answer.put(word, answer.get(word)+1);
        }
        //System.out.println(answer); // {as=4, woodchuck=2, wood=3, chuck=1}

        ArrayList<Integer> values = new ArrayList<>(answer.values()); // [4,2,3,1]
        //values.addAll(answer.values());
        values.sort(Collections.reverseOrder()); // Collections.sort(values, Collections.reverseOrder());

        LinkedHashMap<String,Integer> answer2 = new LinkedHashMap<>(); // maintains insertion order
        for (Integer value : values) {
            for (String word : answer.keySet()) {
                if (answer.get(word).equals(value)) answer2.put(word, answer.get(word));
            }
        }
        System.out.println("Sorted occurrences in DESC order: " + answer2);












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
        System.out.println("map");
        String s1 = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
        System.out.println(parseData(s1));

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

    public static int findSumNumbers(String s){
        //String s = "ab110c045d";
        String[] str = s.replaceAll("[^0-9]", " ").trim().split(" ");
        int sum = 0;
        for (int i = 0; i < str.length; i++){
            sum += Integer.parseInt(str[i]);
        }return sum;
    }

    public static int findBiggestNum(String s){
        //String s = "ab110c045d";
        String[] str = s.replaceAll("[^0-9]", " ").trim().split(" ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++){
            if (Integer.parseInt(str[i]) > max) max = Integer.parseInt(str[i]);
        }return max;
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
        HashMap<String, Integer> newMap = new HashMap<>(); // container for the key+value pairs of the  and # of occurrences
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

    values() --> The method does not accept any parameters;
    The method is used to return a collection view containing all the values of the map.
    */

    public static TreeMap<Integer, String> parseData(String s){
        //String s = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
        TreeMap<Integer, String> result = new TreeMap<>(); // TreeMap will sort the keys from ascending order
        String[] str = s.replaceAll("[{}]", " ").trim().split(" ");	// [104, LA, 101, Paris, 102, Berlin, 103, Chicago, 100, London]
        for (int i = 0; i < str.length; i += 2){ // updating by 2 (every other one) so only looping thur the #
            result.put(Integer.parseInt(str[i]), str[i+1]);
        }
        return result; //{100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}
    }

    public static double calculateTotalPrice(Map<String, Integer> fruitQuanity){
        HashMap<String,String> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", "$2.00");
        fruitPrices.put("Orange", "$3.29");
        fruitPrices.put("Mango", "$4.99");
        fruitPrices.put("Pineapple", "$5.25");

        double total = 0.0;
        for (String fruit : fruitQuanity.keySet()){
            total += fruitQuanity.get(fruit) * Double.parseDouble(fruitPrices.get(fruit).substring(1));
        } return total;
    }


    public static String Q18(String str){
        // "java is fun"
        String first = str.substring(0, str.indexOf(" ")); // java
        String middle = str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")); // is
        String last = str.substring(str.lastIndexOf(" ")+1); // fun
        return last + " " + middle + " " + first;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            if(Arrays.binarySearch(A, i) < 0){
                return i;
            }
        }
        return 1;
    }


}
