package oop_principles.abstraction;

public interface Bluetooth {

    // abstract method w/o body
    void connectsBluetooth();

    //THESE ARE TWO WAYS INTERFACE CAN HAVE ABSTRACT METHOD WITH {BODY}
    // 1. abstract static method
    static int getYear(){
        return 2022;
    }
    // 2. abstract default method
    default boolean isConnected(){
        return true;
    }





}
