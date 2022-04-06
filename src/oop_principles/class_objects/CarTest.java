package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1); // oop_principles.class_objects.Car@1540e19d -- LOCATION

        System.out.println(car1.make); // null
        System.out.println(car1.model); // null
        System.out.println(car1.year); // 0
        System.out.println(car1.color); // null
        /*
        DEFAULT VALUES FOR FIELDS:
        OBJECT                  --> null
        byte, short, int, long  --> 0
        float, double           --> 0.0
        boolean                 --> false
        char                    --> 'empty'
        */

        // THESE VALUES OVERRIDE THE OVERRIDDEN VALUES OF THE CAR CLASS; ONLY FOR THIS SPECIFIC OBJECT
        car1.make = "Honda";
        car1.model = "Accord";
        car1.year = 2017;
        car1.color = "white";

        System.out.println(car1.make); // Honda
        System.out.println(car1.model); // Accord
        System.out.println(car1.year); // 2017
        System.out.println(car1.color); // white

        Car car2 = new Car();
        car2.make = "BMW";
        car2.color = "black";

        System.out.println(car2.make); // BMW
        System.out.println(car2.model); // S ; kept values from the template since it wasn't overridden
        System.out.println(car2.year); // 2022 ; kept values from the template since it wasn't overridden
        System.out.println(car2.color); // black

        // Car Class Methods (what Car does?):
        car1.drives(); // This car drives
        car2.drives();
        car1.honks(); // This car honks
        car2.honks();

        Car car3 = new Car();
        car3.make = "Tesla";
        car3.model = "X";
        car3.year = 2022;
        car3.color = "silver";

        System.out.println("\n-----Cars List------\n");
        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);

        for (Car element : myCars){
            System.out.println(element);
        }
        System.out.println("\n-----Cars From 2022------\n");
        for (Car element : myCars){
            if(element.year == 2022) System.out.println(element);
        }






    }
}
