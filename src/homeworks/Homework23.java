package homeworks;

import java.util.*;

public class Homework23 {

    /* Write a method called as parseData();
    which takes a String has some keys in {} and values after between }{ and returns a collection that has all the keys and values as entries.
    NOTE: The keys should be sorted!

    Test Data:
    {104}LA{101}Paris{102}Berlin{103}Chicago{100}London
    Expected Output:
    {100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}
    */
    public static TreeMap<String, String> parseData(String str){
        String[] words = str.replaceAll("[{}]", " ").trim().split(" ");
        // [104, LA, 101, Paris, 102, Berlin, 103, Chicago, 100, London]
        TreeMap<String, String> map = new TreeMap<>();
        for (int i = 0; i < words.length; i += 2 ) {// this is increasing the loop by 2 --> so its only looping thur the ever other element(#)
            map.put(words[i], words[i + 1]);
        }
        return map;



        /* AKIN'S SOLUTION:
        TreeMap<String, String> dataTable = new TreeMap<>();
        while (str.contains("{")) {
            String key = str.substring(str.indexOf("{") + 1, str.indexOf("}"));
            str = str.substring(str.indexOf("}"));
            String value = str.contains("{") ? str.substring(str.indexOf("}") + 1, str.indexOf("{")) : str.substring(1);
            if (str.contains("{")) str = str.substring(str.indexOf("{"));
            dataTable.put(key, value);
        }
        return dataTable; */

        /* SALIH'S SOLUTION:
        TreeMap<String, String> parsedData = new TreeMap<>();
        for (String keyValue: data.split("\\{")) {
            if (!keyValue.isEmpty()) {
               // String key = keyValue.substring(0, keyValue.indexOf('}'));
               // String value = keyValue.substring(keyValue.indexOf('}') + 1);
                parsedData.put(
                        keyValue.substring(0, keyValue.indexOf('}')),
                        keyValue.substring(keyValue.indexOf('}') + 1)
                );
            }
        }
        return parsedData; */

        /* BURAK'S SOLUTION:
        static TreeMap<Object, Object> convertStringToTreeMap2(String str) {
        TreeMap<Object, Object> treeMap = new TreeMap<>();
        String[] newStr = str.replaceAll("[{}]", "_").split("_");

        for (int i = 1; i < newStr.length; i += 2) {
            treeMap.put(newStr[i].trim(), newStr[i + 1].trim());
        }
        return treeMap; */
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
    */
    public static double calculateTotalPrice1(Map<String, Integer> quantityOfItems){
        double totalPrice = 0;
        HashMap<String, String> pricesOfItems = new HashMap<>();
        pricesOfItems.put("Apple", "$2.00");
        pricesOfItems.put("Orange", "$3.29");
        pricesOfItems.put("Mango", "$4.99");
        pricesOfItems.put("Pineapple", "$5.25");

        for (String item : quantityOfItems.keySet()) {
            totalPrice += Double.parseDouble(pricesOfItems.get(item).substring(1)) * quantityOfItems.get(item);
                        // casting Double.parseDouble here bc it's a set of the String keys
        }
        return totalPrice;
    }


    /* Write a method calculateTotalPrice2();
    which takes a Map of some shopping items with their amounts and calculates the total prices as double.
    Item prices are given below:
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    BUT there will be some discounts as below:
    There will be 50% discount for every second Apple.
    There will be 1 free Mango if customer gets 3. So, fourth one is free.

    Test Data 1:                    Test Data 2:
    {Apple=3, Mango = 5}            {Apple=4, Mango = 8, Orange=3}
    Expected Output 1:              Expected Output 2:
    24.96                           45.81
    */
    public static double calculateTotalPrice2(Map<String, Integer> shoppingList){
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 2.00);
        fruitPrices.put("Orange", 3.29);
        fruitPrices.put("Mango", 4.99);

        double total = 0.00;
        for (String key : shoppingList.keySet()) {
            for (int j = 1; j < shoppingList.get(key)+1; j++) {
                if (key.equals("Apple") && j % 2 == 0) total += fruitPrices.get(key) / 2.0;
                else if (key.equals("Mango") && j % 4 == 0);
                else total += fruitPrices.get(key);
            }
        }
        return Math.round(total * 100.0) / 100.0;

        /* SALIH'S SOLUTION:
        HashMap<String, String> pricesOfItems = new HashMap<>();
        pricesOfItems.put("Apple", "$2.00");
        pricesOfItems.put("Orange", "$3.29");
        pricesOfItems.put("Mango", "$4.99");

        for (String item :quantityOfItems.keySet()) {
            // Integer amountOfItem = quantityOfItems.get(item);
            // mango --> 10 / 4 = 2
            // mango -->  quantityOfItems.get(item) / 4 = 2

            // Apple --> 11 / 2 = 5
            // Apple --> 12 / 2 = 6
            // Apple -->  quantityOfItems.get(item) / 2

            totalPrice += Double.parseDouble(pricesOfItems.get(item).substring(1)) * quantityOfItems.get(item);
            if (item.equals("Mango")) totalPrice -=
                    Double.parseDouble(pricesOfItems.get(item).substring(1)) * (int)(quantityOfItems.get(item) / 4);
            if (item.equals("Apple")) totalPrice -=
                    (Double.parseDouble(pricesOfItems.get(item).substring(1)) / 2) * (int)(quantityOfItems.get(item) / 2);
        }
        return totalPrice; */
    }



    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("\n-----TASK 2------");
        Map<String, Integer> t2_Map1 = new HashMap<>();
        t2_Map1.put("Apple", 3);
        t2_Map1.put("Mango", 1);
        System.out.println(calculateTotalPrice1(t2_Map1));

        Map<String, Integer> t2_Map2 = new HashMap<>();
        t2_Map2.put("Apple", 2);
        t2_Map2.put("Pineapple", 1);
        t2_Map2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(t2_Map2));

        System.out.println("\n-----TASK 3------");
        Map<String, Integer> t3_Map1 = new HashMap<>();
        t3_Map1.put("Apple", 3);
        t3_Map1.put("Mango", 5);
        System.out.println(calculateTotalPrice2(t3_Map1));

        Map<String, Integer> t3_Map2 = new HashMap<>();
        t3_Map2.put("Apple", 4);
        t3_Map2.put("Mango", 8);
        t3_Map2.put("Orange", 3);
        System.out.println(calculateTotalPrice2(t3_Map2));

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

        double totalPrice = 0;
        for (String fruit : fruitCount.keySet()){ // This method is used to return a Set view of the keys contained in this map ex: {apple,orange,mango}
            totalPrice += fruitPrices.get(fruit) * fruitCount.get(fruit);
        }
        System.out.println(totalPrice);



    }
}
