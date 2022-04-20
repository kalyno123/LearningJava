package oop_principles.abstraction;

import oop_principles.inheritance.Person;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* TASK 1:
    Create an object of Samsung called as s1 info it will have is as below
    Samsung
    Black
    64
    700
    */
        Samsung s1 = new Samsung("Samsung", "black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        System.out.println("\n-----TASK 2------\n");
    /* TASK 2:
    Print all objects
    Find and print the most expensive one with the message -> "The most expensive phone is = IPhone"
    Find and print how many phones are convertible -> 2
    */
        int countConvert = 0;
        double max = Integer.MIN_VALUE;
        Phone mostExpensive = null; // container for most expensive Phone -- instead of String its Phone Class and instead of "" its 'null'

        for (Phone element : phones){
            System.out.println(phones);
            if (element.price > max) mostExpensive = element;
            if (element.isConvertible()) countConvert++;
        }
        System.out.println("The most expensive phone is = " + mostExpensive.getClass().getSimpleName());
        System.out.println(countConvert);
        System.out.println("The color of the most expensive phone is = " + mostExpensive.color);

        //phones.forEach(element -> System.out.println(element));
        //System.out.println(phones.stream().filter(Phone::isConvertible).count()); // CAN ALSO BE: phones.stream().filter(Phone::isConvertible).count()




    }
}
