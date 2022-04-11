package acessModifiers.package1;

public class Honda {

    static{

    }


    {

    }
    /* BLOCKS:
    - we have static and instance blocks ... these blocks will not take any access modifier as they are not invoked with any ClassName not Objects.
    - block can not be final bc since you can call it you can change it therefore its understood that its final already.
    */

    /* protected Honda(){

    } */

    public Honda(){

    }

    //Instance variables:
    public static final String make = "Honda";
    public String color;
    protected String model;
    int year; // this is default
    private double price;

    // all the above is accessible in this same class
    // in same package but another class model, color, year are accessible
    // in a class of diff package only color is accessible


    public static void main(String[] args) {
        Honda h1 = new Honda();

    }



}
