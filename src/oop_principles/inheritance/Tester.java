package oop_principles.inheritance;

public class Tester extends Person{

    // Tester Class is able to inherit all the Person's Class default, public, and protected information
    // private cannot be inherited as its only accessible within same Class.

    //DEFAULT CONSTRUCTOR
    public Tester() {

    }

    //CUSTOM CONSTRUCTOR
    public Tester (String fName, String lName, int age, String gender) {
        // can assign instance variable to local variable in 3 different ways:
        //1 super(fName, lName, age, gender); --> 'super' KEYWORD CAN BE USED TO REFERENCE THE PARENT CLASS
        //2
        this.fName = fName;
        this.lName = lName;
        //3
        super.age = age;
        super.gender = fName;
    }

    public void code(){
        System.out.println("Tester codes");
    }

    @Override
    public void eat() {
        System.out.println("Tester eats");
    }

    @Override
    public void sleep() {
        System.out.println("Tester sleeps");
    }

    @Override
    public void learn() {
        System.out.println("Tester learns");
    }

    @Override
    public void walk() {
        System.out.println("Tester walks");
    }







}
