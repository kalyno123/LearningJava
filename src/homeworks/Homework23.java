package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    /* Write a method called as parseData();
    which takes a String has some keys in {} and values after between }{ and returns a collection that has all the keys and values as entries.
    NOTE: The keys should be sorted!

    Test Data:
    {104}LA{101}Paris{102}Berlin{103}Chicago{100}London
    Expected Output:
    {100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}
    */
    public static Map<Integer, String> parseData(String s){
        String[] words = s.replaceAll("[{}]", " ").trim().split(" ");
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(Integer.parseInt(words[i]), words[i + 1]);
            i++;
        }
        return map;
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
    public static double calculateTotalPrice1(Map<String, Integer> groceries){
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 2.00);
        fruitPrices.put("Orange", 3.29);
        fruitPrices.put("Mango", 4.99);
        fruitPrices.put("Pineapple", 5.25);

        double total = 0.0;
        for (String s : groceries.keySet()) {
            total += groceries.get(s) * fruitPrices.get(s);
        }
        return total;
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

        double sum = 0.00;
        for (String key : shoppingList.keySet()) {
            for (int j = 1; j < shoppingList.get(key)+1; j++) {
                if (key.equals("Apple") && j % 2 == 0) sum += fruitPrices.get(key) / 2.0;
                else if (key.equals("Mango") && j % 4 == 0);
                else sum += fruitPrices.get(key);
            }
        }
        return Math.round(sum * 100.0) / 100.0;
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
    }
}
