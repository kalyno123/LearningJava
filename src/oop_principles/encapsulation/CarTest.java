package oop_principles.encapsulation;

public class CarTest {
    public static void main(String[] args) {
        // CREATE OBJECT
        Car car1 = new Car();
        // SETTING VALUE FOR INSTANCE VARIABLE (MAKE)
        car1.make = "BMW";
        // GETTING VALUE OF THE INSTANCE VARIABLE (MAKE)
        System.out.println(car1.make); // BMW

        // ^^ the above is DIRECT ACCESS to setting and getting the info


        //SETTING INFO USING SETTER METHOD
        car1.setYear(2020);
        //GETTING INFO USING GETTER METHOD
        System.out.println(car1.getYear()); // 2020

        car1.setPrice(5000, "abc1234"); // password matched - so no exception thrown
        System.out.println(car1.getPrice()); // 5000;
        // if there was no price set; and you're trying to get it then it'll return the default value 0.0







    }
}
