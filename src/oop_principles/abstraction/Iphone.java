package oop_principles.abstraction;

public class Iphone extends Phone{

    public Iphone() {

    }

    public Iphone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
        // super(); MUST be the first statement of the subclass constructor
        // super(); variables are referencing the instance variables in the abstract class(aka iphone's parent)
    }

    public static final String OS = "iOS";

    @Override
    public void call() {
        System.out.println("iPhone calls");
    }

    @Override
    public void text() {
        System.out.println("iPhone texts");
    }

    @Override
    public void ring() {
        System.out.println("iPhone rings");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }


}
