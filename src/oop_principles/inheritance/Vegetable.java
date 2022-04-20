package oop_principles.inheritance;

public class Vegetable extends Food{

    // INSTANCE VARIABLE:
    public String color;

    // OVERRIDE toString();
    @Override
    public String toString() {
        return "Vegetable{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic() +
                ", color='" + color + '\'' +
                '}';

        /* since isOrganic is private it is only accessible within the SAME Class.
        But the get method is public so can use it in the subclass.
        color is an extra instance variable that Vegetable subclass has that superclass Food didn't.
        */
    }





}
