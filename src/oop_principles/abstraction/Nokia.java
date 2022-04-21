package oop_principles.abstraction;

public class Nokia extends Phone{

    public Nokia() {

    }

    public Nokia(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
        // super(); MUST be the first statement of the subclass constructor
        // super(); variables are referencing the instance variables in the abstract class(aka nokia's parent)
    }

    // instance variable
    public static final String OS = "Android";

    // method from abstract class
    @Override
    public void call() {
        System.out.println("Nokia calls");
    }

    @Override
    public void text() {
        System.out.println("Nokia texts");
    }

    @Override
    public void ring() {
        System.out.println("Nokia calls");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    // method from interface
    @Override
    public void takesPhoto() {
        System.out.println("Samsung takes photo");
    }







}
