package oop_principles.abstraction;

public class Samsung extends Phone implements Camera, Bluetooth{

    public Samsung() {

    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
        //super.brand = brand;
        // super(); MUST be the first statement of the subclass constructor
        // super(); variables are referencing the instance variables in the abstract class(aka samsung's parent aka Phone class)
    }

    // instance variable
    public static final String OS = "Android";

    // method from abstract class
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

    // method from interface
    @Override
    public void takesPhoto() {
        System.out.println("Samsung takes photo");
    }

    @Override
    public void connectsBluetooth() {
        System.out.println("Samsung connects to bluetooth");
    }





}
