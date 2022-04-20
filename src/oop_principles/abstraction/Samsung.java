package oop_principles.abstraction;

public class Samsung extends Phone{

    public Samsung() {

    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
        // super(); MUST be the first statement of the subclass constructor
        // super(); variables are referencing the instance variables in the abstract class(aka samsung's parent)
    }

    public static final String OS = "Android";

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }


}
