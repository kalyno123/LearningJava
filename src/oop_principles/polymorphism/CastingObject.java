package oop_principles.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {

        // NO CASTING
        Cat cat1 = new Cat();

        // UP-CASTING: happens when reference is type of parent, but object is child. Up-casting happens implicitly.
        Animal animal1 = new Cat(); // UP-CASTING CAT IN THE ANIMAL FORM
        Object object1 = new Cat(); // UP-CASTING CAT IN THE OBJECT FORM
        List<Animal> animals = new ArrayList<>(); // UP-CASTING ARRAYLIST IN LIST FORM

        /* DOWN-CASTING: happens when reference is type of child, but object is parent. Down-casting happens explicitly.
        BUT there could be data loss with primitives. There can be an Exception thrown with Object if casting improperly.
        */



    }
}
