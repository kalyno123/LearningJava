package singleton;

import java.awt.*;

public class Test2 {
    public static void main(String[] args) {

        //Only way to access the Driver instance(Object) is through the public getter method
        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();
        Driver d4 = Driver.getDriver();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);


        for (int i = 0; i < 10; i++){
            System.out.println(Driver.getDriver());
        }
        //It is clearly seen above that all driver references are pointing the same object in the heap

        // ALL THE NEW OBJECTS BEING CREATED ARE REFERENCE THE SAME SINGLE OBJECT -- SAME ADDRESS IN THE HEAP

    }
}
