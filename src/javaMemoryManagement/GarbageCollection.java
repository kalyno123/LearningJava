package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {

    /* Garbage Collection is a process of destroying objects that lost references. Garbage Collection runs automatically (implicitly).
    GARBAGE COLLECTING is also known as "object that lost their reference".
    NOTE: Garbage Collection applies only to HEAP(objects).
    */
        Dog dog1 = new Dog(); // this DOG Object was destroyed by Garbage Collector
        Dog dog2 = new Dog();

        System.out.println("Object BEFORE losing their reference variable");
        System.out.println(dog1); // Dog@1540e19d
        System.out.println(dog2); // Dog@677327b6
        System.out.println(dog1.equals(dog2)); // false

        System.out.println("\nObject AFTER losing their reference variable");
        dog1 = dog2; // dog1 Object got destroyed by the Garbage Collector since its Object is not being used anymore after the reassignment.

        //THIS IS HOW TO EXPLICITLY INVOKE GARBAGE COLLECTOR:
        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(dog1); // Dog@677327b6
        System.out.println(dog2); // Dog@677327b6
        System.out.println(dog1.equals(dog2)); // true










    }
}
