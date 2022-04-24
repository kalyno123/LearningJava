package oop_principles.package5;

import oop_principles.inheritance.Person;

public class Singer extends Person {

    // fname, lname, age and gender was inherited due to accessibility level
    // This Singer Class is in a different package than Person Class.
    // Therefore, it can only inherit public and protected information.

    // DEFAULT CONSTRUCTOR
    public Singer() {

    }

    // CUSTOM CONSTRUCTOR
    public Singer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void sing(){
        System.out.println("Singer sings");
    }



}
