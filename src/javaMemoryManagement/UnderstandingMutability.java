package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {

        String city = "Chicago";
        String address = "Chicago";
        System.out.println(city == address); // THIS IS NOT PROPER -- never compare String with == operator use equals();
        //returning true but only bc its location is equal since the value they are pointing to are the same therefore same location

        city = "Miami"; // a new String value is created in the String Pool and the old Chicago value is kept not deleted

        //whatever you have in the String pool it will not be deleted not garbage collected.
        //NOTE: String pool hold the values of the Strings


    }
}
