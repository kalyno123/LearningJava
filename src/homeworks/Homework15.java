package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* TASK 1:
    Create an ArrayList and store below numbers: 10, 23, 67, 23, 78
    THEN:
    -Print element at index of 3
    -Print element at index of 0
    -Print element at index of 2
    -Print the entire list
    Expected Result:
    23
    10
    67
    [10, 23, 67, 23, 78]
    */
        List<Integer> numbersT1 = new ArrayList<>();
        numbersT1.add(10);
        numbersT1.add(23);
        numbersT1.add(67);
        numbersT1.add(23);
        numbersT1.add(78);

        System.out.println(numbersT1.get(3));
        System.out.println(numbersT1.get(0));
        System.out.println(numbersT1.get(2));
        System.out.println(numbersT1);

        System.out.println("\n-----TASK 2------\n");
    /* TASK 2:
    Create an ArrayList and store below colors: Blue, Brown, Red, White, Black, Purple
    THEN:
    -Print element at index of 1
    -Print element at index of 3
    -Print element at index of 5
    -Print the entire list
    Expected Result:
    Brown
    White
    Purple
    [Blue, Brown, Red, White, Black, Purple]
    */
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n-----TASK 3------\n");
    /* TASK 3:
    Create an ArrayList and store below numbers: 23, -34, -56, 0, 89, 100
    THEN:
    -Print the entire list
    -Print the entire list sorted in ascending order
    Expected Result:
    [23, -34, -56, 0, 89, 100]
    [-56, -34, 0, 23, 89, 100]
    */
        List<Integer> numbersT3 = new ArrayList<>();
        numbersT3.add(23);
        numbersT3.add(-34);
        numbersT3.add(-56);
        numbersT3.add(0);
        numbersT3.add(89);
        numbersT3.add(100);

        System.out.println(numbersT3);
        Collections.sort(numbersT3); // must use Collections Class to sort Lists
        System.out.println(numbersT3);

        System.out.println("\n-----TASK 4------\n");
    /* TASK 4:
    Create an ArrayList and store below cities: Istanbul, Berlin, Madrid, Paris
    THEN:
    -Print the entire list
    -Print the entire list sorted lexicographically
    Expected Result:
    [Istanbul, Berlin, Madrid, Paris]
    [Berlin, Istanbul, Madrid, Paris]
    */
        List<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n-----TASK 5------\n");
    /* TASK 5:
    Create an ArrayList and store Marvel characters below: Spider-Man, Iron Man, Black Panther, Deadpool, Captain America
    THEN:
    -Print the entire list
    -Then, check if it contains Wolverine
    if it contains Wolverine, then print true
    if it does not contain Wolverine, print false
    Expected Result:
    [Spider-Man, Iron Man, Black Panther, Deadpool, Captain America]
    false
    */
        List<String> marvelHeroes = new ArrayList<>();
        marvelHeroes.add("Spider-Man");
        marvelHeroes.add("Iron Man");
        marvelHeroes.add("Black Panther");
        marvelHeroes.add("Deadpool");
        marvelHeroes.add("Captain America");
        System.out.println(marvelHeroes);

        boolean hasWolverine = false;
        for (String element : marvelHeroes){
            if (element.equals("Wolverine")){
                hasWolverine = true;
            }
        }
        System.out.println(hasWolverine);

        System.out.println("\n-----TASK 6------\n");
    /* TASK 6:
    Create an ArrayList and store Avengers characters below: Hulk, Black Widow, Captain America, Iron Man
    THEN:
    -Print the entire list sorted lexicographically
    -Then, check if it contains Hulk and Iron Man
	if it contains both, then print true
	if it does not contain both, print false
    Expected Result:
    [Black Widow, Captain America, Hulk, Iron Man]
    true
    */
        List<String> avengersHeroes = new ArrayList<>();
        avengersHeroes.add("Hulk");
        avengersHeroes.add("Black Widow");
        avengersHeroes.add("Captain America");
        avengersHeroes.add("Iron Man");

        Collections.sort(avengersHeroes);
        System.out.println(avengersHeroes);
        Object[] avengersArray = avengersHeroes.toArray(); // here converting ArrayList to Array using toArray() Method; I understand Object is the superclass but why Object[]?
        System.out.println(Arrays.binarySearch(avengersArray, "Hulk") >= 0 && Arrays.binarySearch(avengersArray, "Iron Man") >= 0);

        /* NATALIA'S SOLUTION:
        String containsHulkAndIronMan = "";
        for (String element : avengersHeroes) {
            if (element.contains("Hulk") || element.contains("Iron Man"))
                containsHulkAndIronMan += element;
        }
        System.out.println(containsHulkAndIronMan.contains("Hulk") && containsHulkAndIronMan.contains("Iron Man"));
        */

        System.out.println("\n-----TASK 7------\n");
    /* TASK 7:
    Create an ArrayList and store characters below: A, x, $, %, 9, *, +, F, G
    THEN:
    -Print the entire list
    -Print each element
    Expected Result:
    [A, x, $, %, 9, *, +, F, G]
    A
    x
    $
    %
    9
    *
    +
    F
    G
    */
        List<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');
        System.out.println(chars);

        //chars.forEach(element -> System.out.println(element)); --> CAN ALSO BE: chars.forEach(System.out::println);

        for (Character element : chars){ // should we do unboxing(char) or better to use Wrapper?
            System.out.println(element);
        }

        System.out.println("\n-----TASK 8------\n");
    /* TASK 8:
    Create an ArrayList and store below objects: Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
    THEN:
    -Print the entire list
    -Print the entire list sorted lexicographically
    -Count objects that starts with M or m
    -Count objects that does not have A or a OR E or e
    Expected Result:
    [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
    [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
    3
    1
    */
        List<String> schoolSupplies = new ArrayList<>();
        schoolSupplies.add("Desk");
        schoolSupplies.add("Laptop");
        schoolSupplies.add("Mouse");
        schoolSupplies.add("Monitor");
        schoolSupplies.add("Mouse-Pad");
        schoolSupplies.add("Adapter");

        System.out.println(schoolSupplies);
        Collections.sort(schoolSupplies);
        System.out.println(schoolSupplies);

        int countM = 0, countNotAE = 0;
        for (String element : schoolSupplies){
            if (element.startsWith("M") || element.startsWith("m")) countM++;
            if (!(element.contains("a") || element.contains("A") || element.contains("e") || element.contains("E"))) countNotAE++;
        }
        System.out.println(countM);
        System.out.println(countNotAE);

        System.out.println("\n-----TASK 9------\n");
    /* TASK 9:
    Create an ArrayList and store below kitchen objects: Plate, spoon, fork, Knife, cup, Mixer
    THEN:
    -Print the entire list
    -Print how many elements starts with uppercase
    -Print how many elements starts with lowercase
    -Print how many elements has P or p
    -Print how many elements starts or ends with P or p
    Expected Result:
    [Plate, spoon, fork, Knife, cup, Mixer]
    Elements starts with uppercase = 3
    Elements starts with lowercase = 3
    Elements having P or p= 3
    Elements starting or ending with P or p = 2
    */
        List<String> kitchenSupplies = new ArrayList<>();
        kitchenSupplies.add("Plate");
        kitchenSupplies.add("spoon");
        kitchenSupplies.add("fork");
        kitchenSupplies.add("Knife");
        kitchenSupplies.add("cup");
        kitchenSupplies.add("Mixer");
        System.out.println(kitchenSupplies);

        int countUpper = 0, countLower = 0, countPp = 0, countStartEndP = 0;
        for (String element : kitchenSupplies){
            if (Character.isUpperCase(element.charAt(0))) countUpper++;
            else if (Character.isLowerCase(element.charAt(0))) countLower++;
            if (element.contains("P") || element.contains("p")) countPp++;
            if (element.startsWith("P") || element.startsWith("p") || element.endsWith("P") || element.endsWith("p")) countStartEndP++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + countPp);
        System.out.println("Elements starting or ending with P or p = " + countStartEndP);

        System.out.println("\n-----TASK 10------\n");
    /* TASK 10:
    Create an ArrayList and store below numbers: 3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
    THEN:
    -Print the entire list
    -Print how many element can be divided by 10
    -Print how many even numbers are greater than 15
    -Print how many odd numbers are less than 20
    -Print how many elements are less than 15 or greater than 50
    Expected Result:
    [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
    Elements that can be divided by 10 = 4
    Elements that are even and greater than 15 = 3
    Elements that are odd and less than 20 = 4
    Elements that are less than 15 or greater than 50 = 8
    */
        List<Integer> numbersT10 = new ArrayList<>();
        numbersT10.add(3);
        numbersT10.add(5);
        numbersT10.add(7);
        numbersT10.add(10);
        numbersT10.add(0);
        numbersT10.add(20);
        numbersT10.add(17);
        numbersT10.add(10);
        numbersT10.add(23);
        numbersT10.add(56);
        numbersT10.add(78);
        System.out.println(numbersT10);

        int countDivisibleBy10 = 0, countEvenGreaterThan15 = 0, countOddLessThan20 = 0, countLess15OrGreater20 = 0;
        for (Integer element : numbersT10){
            if (element % 10 == 0) countDivisibleBy10++;
            if (element % 2 == 0 && element > 15) countEvenGreaterThan15++;
            if (element % 2 != 0 && element < 20) countOddLessThan20++;
            if (element < 15 || element > 50) countLess15OrGreater20++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDivisibleBy10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + countOddLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLess15OrGreater20);





    }
}
