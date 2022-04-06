package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleTest {
    public static void main(String[] args) {

        //CREATE 2 APPLE OBJECTS
        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;

        //System.out.println(apple1); --> oop_principles.class_objects.Apple@1540e19d --> this is the location of where the object was created in memory
        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);
        System.out.println(apple1); // Apple{color=Red, taste=Sweet, price=0.99}

        //if you don't define the information for the variable then it'll return it's null values
        Apple apple2 = new Apple();
        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;

        System.out.println(apple2.color);
        System.out.println(apple2.taste);
        System.out.println(apple2.price);
        System.out.println(apple2); //Apple{color=Green, taste=Sour, price=1.29}

        Apple apple3 = new Apple();
        apple3.color = "Yellow";
        apple3.price = 0.95;
        apple3.taste = "Sweet";
        // order of declare and assign doesn't matter due to the main order set in the constructor
        System.out.println(apple3); // Apple{color=Yellow, taste=Sweet, price=0.95}

        Apple[] myApples = {apple1, apple2, apple3};
        System.out.println(Arrays.toString(myApples));

        // Apple Class being invoked in the < >
        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples)); // converting Array to ArrayList
        System.out.println(myAppleList);

        for (Apple element : myAppleList){
            System.out.println("My Apple = " + element); // printing each collection of apples
        }

        for (Apple element : myAppleList){ // printing each attributes of each collection one by one
            System.out.println(element.color);
            System.out.println(element.taste);
            System.out.println(element.price);
        }












    }
}
