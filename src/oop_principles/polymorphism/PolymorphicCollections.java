package oop_principles.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PolymorphicCollections {
    public static void main(String[] args) {

        /* Dynamic Polymorphism vs Static Polymorphism:
        Dynamic Polymorphism - Runtime polymorphism -> it is method overriding
            - Java doesn't know which version of method implementation gets executed until we run the code
        Static Polymorphism - Compile-time polymorphism -> it is method overloading
            - Java knows exactly which method it will pick based on the parameter you passed for a method
        */

        System.out.println("\n-----Cat Object------\n");
        Cat cat1 = new Cat();
        cat1.eat();// Cat eats
        cat1.sleep();// Cat sleeps
        cat1.eat("fish");// Animal eats fish

        System.out.println("\n-----Dog Object------\n");
        Dog dog1 = new Dog();
        dog1.eat(); // Dog eats
        dog1.sleep();// Dog sleeps
        dog1.eat("meat");// Animal eats fish

        System.out.println("\n-----Animal Object------\n");
        Animal animal1 = new Animal();
        animal1.eat(); // this is DYNAMIC POLYMORPHISM - OVERRIDDEN METHOD
        animal1.sleep(); // this is DYNAMIC POLYMORPHISM - OVERRIDDEN METHOD
        animal1.eat("some food"); // this is STATIC POLYMORPHISM - OVERLOADED METHOD

        System.out.println("\n-----Dog and Cat Object in Animal form------\n");
    /* TASK:
    Create a Cat and a Dog object in the shape of Animal.
    Invoke their eat() and sleep() methods which are zero arg.
    */
        Animal cat2 = new Cat();
        cat2.eat();// Cat eats
        cat2.sleep();// Cat sleeps

        Animal dog2 = new Dog();
        dog2.eat(); // Dog eats
        dog2.sleep();// Dog sleeps

        // until its ran ... compiler associates the Object Dog with parent Animal Class
        // HOWEVER, ONCE IT IS EXECUTED THE RUNTIME GRABS THE OBJECT BEING REFERENCE FROM THE HEAP AND WILL RETURN THE PROPER ASSOCIATED VALUE
        // HINT: DYNAMIC POLYMORPHISM ignores the left side => (compiler looks left) -- focuses on right side of => (runtime looks right)

        System.out.println("\n-----Dog and Cat Object in Animal Array------\n");
        Animal[] animals = {cat1, dog1, animal1, cat2, dog2};

        for (Animal element : animals){
            System.out.println(element.getClass().getSimpleName());
        }

        System.out.println("\n-----Dog and Cat Object in Animal ArrayList------\n");
        // TASK: Store all objects in an ArrayList and execute eat() method for each object

        // ONE WAY TO ADD TO ARRAYLIST
        ArrayList<Animal> creatures1 = new ArrayList<>();
        creatures1.add(cat1);
        creatures1.add(dog1);
        creatures1.add(animal1);
        creatures1.add(cat2);
        creatures1.add(dog2);

        // SECOND WAY TO ADD TO ARRAYLIST
        ArrayList<Animal> creatures2 = new ArrayList<>(Arrays.asList(animals));

        // THIRD WAY TO ADD TO ARRAYLIST
        ArrayList<Animal> creatures3 = new ArrayList<>();
        Collections.addAll(creatures3, animals); // 1st arg: collection to be added to, 2nd arg: from which collection info is taken from

        // FOURTH WAY TO ADD TO ARRAYLIST
        ArrayList<Animal> creatures4 = new ArrayList<>();
        for (Animal element : animals){
            creatures4.add(element);
        }

        // EXECUTING EAT(); METHOD
        creatures4.forEach(element -> element.eat());
        // CAN ALSO BE: new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat); // using an object right away w/o storing is called -->





    }
}
