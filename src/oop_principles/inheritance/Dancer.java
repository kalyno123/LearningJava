package oop_principles.inheritance;

public class Dancer extends Person{

    // Dancer Class is able to inherit all the Person's Class default, public, and protected information
    // private cannot be inherited as its only accessible within same Class.

    // DEFAULT CONSTRUCTOR
    public Dancer() {

    }

    // CUSTOM CONSTRUCTOR
    public Dancer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void dance(){
        System.out.println("Dancer dances");
    }





}
