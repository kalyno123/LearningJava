package oop_principles.inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 2------\n");
    /* TASK 1:
    Create a food1 object and define below info for it. And, print it.
        taste = delicious
        name = sushi
        isSpicy = true
        isOrganic = true
    First, print the name of the food
    Then, print if the food is organic
    Finally, print the object itself
    */
        Food food1 = new Food();
        food1.taste = "delicious";
        food1.name = "sushi";
        food1.isSpicy = true;
        // food1.isOrganic() = true; THIS IS DIRECT ACCESS BUT RESULT IN COMPILER ERROR BC isOrganic is PRIVATE
        food1.setOrganic(true); // THIS IS INDIRECT ACCESS USING ITS SET METHOD

        System.out.println(food1.name); // sushi
        System.out.println(food1.isOrganic()); // true
        System.out.println(food1);

        System.out.println("\n-----TASK 2------\n");
    /* TASK 2:
    Create a vegetable1 object and define below info for it
    taste = good
    name = parsley
    isSpicy = false
    isOrganic = true
    color = green
    First, print the name of the vegetable and color of the vegetable
    Then, print if the vegetable is organic
    Finally, print the object itself
    */
        Vegetable vegetable1 = new Vegetable();
        vegetable1.taste = "good";
        vegetable1.name = "parsley";
        vegetable1.isSpicy = false;
        vegetable1.setOrganic(true);
        vegetable1.color = "green";

        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic());
        System.out.println(vegetable1);

        System.out.println("\n-----TASK 3------\n");
    /* TASK 3:
    Create another vegetable2 object and define only the name and print the Object:
    name = broccoli
    */
        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";
        System.out.println(vegetable2);

        System.out.println("\n-----TASK 4------\n");
    /* TASK 4:
    I have one Food object -> sushi
    I have 2 Vegetable objects -> parsley, broccoli
    Count and print how many elements in the list has a name that has more than 5 characters
    RESULT:
    2
    */
        ArrayList<Food> foods = new ArrayList<>(); // the ClassType of the collection should ALWAYS be the superclass(parent)
        foods.add(food1);
        foods.add(vegetable1);
        foods.add(vegetable2);

        System.out.println("\n-----ONE WAY------\n");
        int count = 0;
        for (Food element : foods){
            if (element.name.length() > 5) count++;
        }
        System.out.println(count);

        System.out.println("\n-----ANOTHER WAY------\n");
        System.out.println(foods.stream().filter(food -> food.name.length() > 5).count());








    }
}
