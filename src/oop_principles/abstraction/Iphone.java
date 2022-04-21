package oop_principles.abstraction;

public class Iphone extends Phone implements Camera, Bluetooth{

    public Iphone() {

    }

    public Iphone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
        // super(); MUST be the first statement of the subclass constructor
        // super(); variables are referencing the instance variables in the abstract class(aka iphone's parent)
    }

    // instance variable
    public static final String OS = "iOS";

    // method from abstract class
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

    // method from interface
    @Override
    public void takesPhoto() {
        System.out.println("Samsung takes photo");
    }

    @Override
    public void connectsBluetooth() {
        System.out.println("iPhone connects to bluetooth");
    }





}
