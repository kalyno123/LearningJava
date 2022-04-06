package collections.arrayLists;

import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {

    /* TASK-1:
    Create an ArrayList of germanCars and add below items
    BMW
    Mercedes
    Volkswagen

    Then print the list

    RESULT:
    German cars = [BMW, Mercedes, Volkswagen]
     */
        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars = " + germanCars);

    /* TASK-2:
    Create an ArrayList of japaneseCars and add below items
    Honda
    Toyota
    Lexus

    Then print the list

    RESULT:
    Japanese cars = [Honda, Toyota, Lexus]
    */
        ArrayList<String> japanCars = new ArrayList<>();
        japanCars.add("Honda");
        japanCars.add("Toyota");
        japanCars.add("Lexus");

        System.out.println("Japan cars =" + japanCars);

    /* TASK-3:
    Create an ArrayList of luxuryCars and store below cars
    Maserati
    Tesla
    Range Rover
    Jaguar

    Then print the list

    RESULT:
    Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
    */
        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars =" + japanCars);

        //CREATE A NEW ARRAYLIST TO HOLD THE 3 COLLECTIONS IN ONE:
        ArrayList<String> carsInventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + carsInventory);

        //ADDING ALL GERMAN, JAPAN, AND LUXURY CARS TO THE INVENTORY:
        carsInventory.addAll(germanCars);
        // carsInventory.addAll(1, japanCars); -->
        carsInventory.addAll(japanCars);
        System.out.println("Inventory of cars after adding german and japanese cars = " + carsInventory);
        carsInventory.addAll(luxuryCars);
        System.out.println("Inventory of cars after adding luxury cars = " + carsInventory);

        //REMOVING ALL JAPANESE CARS:
        carsInventory.removeAll(japanCars);
        System.out.println("Inventory after removing Japanese cars = " + carsInventory); //[BMW, Mercedes, Volkswagen]

        //REMOVING ONLY SPECIFIC ELEMENTS:
        ArrayList<String> carToBeRemove = new ArrayList<>();
        carToBeRemove.add("BMW");
        carToBeRemove.add("Mercedes");

        carsInventory.removeAll(carToBeRemove);
        System.out.println("Inventory after removing BMW and Mercedes = " + carsInventory);




    }
}
