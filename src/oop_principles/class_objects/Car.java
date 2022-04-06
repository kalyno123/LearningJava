package oop_principles.class_objects;

public class Car {

    // template doesn't have run symbol by the class
    // 'f' icon represents fields
    // 'm' icon represents methods

    //DEFAULT CONSTRUCTOR
    public Car(){

    }

    /* ATTRIBUTES ARE DEFINING WHAT EVERY OBJECT OF CAR SHOULD HAVE
    Attributes of a car: make, model, year, color
    */
    // Declaring Attributes or Field of Car()
    /* IF ONLY DECLARE THEN JAVA GIVES DEFAULT VALUE WHEN INVOKED.
    public String make;
    public String model;
    public int year;
    public String color;
    */
    /* DEFAULT VALUES FOR FIELDS:
    OBJECT                  --> null
    byte, short, int, long  --> 0
    float, double           --> 0.0
    boolean                 --> false
    char                    --> 'empty'
    */

    // IF DECLARE AND ASSIGN THEN THESE VALUES WILL OVERRIDE THE DEFAULT;
    // this assignment in the template will be inherited by all objects instantiate fom this class
    public String make = "Tesla";
    public String model = "S";
    public int year = 2022;
    public String color = "red";

    //DEFINING SOME METHODS(BEHAVIORS) OF THE CAR OBJECT: (what Car does?)
    public void drives(){
        System.out.println("This car drives");
    }

    public void honks(){
        System.out.println("This car honks");
    }

    //right click > generate > toString() > select what you want to include > then generate the format.
    @Override // <-- this is an override annotation (OPTIONAL to have)
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }




}
