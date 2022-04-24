package oop_principles.encapsulation;

public class Car {

    // INSTANCE VARIABLE:
    public String make;
    private int year; // this instance variable is private, so it's only accessible DIRECTLY within same Class
    private double price; // ex: required a pw to set price value
    private boolean isConvertible = true;
    //^at this point cannot be overridden (even tho it's not final) since it private and no setter method is provided

    // PROVIDING INDIRECT ACCESS TO YEAR (in order to set and get info)
    public void setYear(int year){ // setter methods are MOSTLY VOID as it doesn't return anything
        this.year = year;
    }

    public int getYear(){ // getter methods are ALWAYS RETURN-TYPE as it returns the value
        return year; // OR CAN ALSO BE: return this.year;
    }

    // this is like writing - setting info
    public void setPrice(double price, String adminPassword){
        if(adminPassword.equals("abc1234")) this.price = price; // if the admin pw given is valid then the price can be set
        else throw new RuntimeException("The password entered is not valid!"); // if pw is invalid this exception msg error will be thrown
    }

    // this is like writing - getting info
    public double getPrice(){
        return price;
    }





}
