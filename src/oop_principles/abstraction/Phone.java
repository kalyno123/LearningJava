package oop_principles.abstraction;

public abstract class Phone {

    static {

    }

    //DEFAULT CONSTRUCTOR
    public Phone() {

    }

    //CREATE A 4 ARGS CONSTRUCTOR
    // Although, objects cannot be instantiated from abstract class.
    // However, its purpose is to be inherited in subclasses constructor.
    public Phone(String brand, String color, int storage, double price) {
        this.brand = brand;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    //DEFINE FEATURES OF PHONES
    public String brand;
    public String color;
    public int storage;
    public double price;

    //DEFINE WHAT EVERY PHONE SHOULD DO -- abstract methods = is a method that has nobody.
     public abstract void call();
     public abstract void text();
     public abstract void ring();
     public abstract boolean isConvertible();

    //OVERRIDE toString()
    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }

    // method from interface
    public abstract void takesPhoto();



}
