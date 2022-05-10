package singleton;

public class Driver {

    /*
    How to achieve singleton?
    1. MAKE DEFAULT CONSTRUCTOR PRIVATE
    2. DECLARE A PRIVATE INSTANCE VARIABLE OF THE OBJECT OF DRIVER
    3. MAKE THIS VARIABLE STATIC AND PROVIDE A STATIC GETTER METHOD
    4. PROVIDE IF CONDITION TO INITIALIZE THE CLASS INSTANCE VARIABLE
        - IF IT IS NULL THEN INITIALIZE IT
        - IF IT IS NOT NULL THEN RETURN THE DRIVER WHICH HAS BEEN ALREADY INITIALIZED
    NOTE: WE UNDERSTAND THAT THE SINGLE CLASS OBJECT IS ALSO ENCAPSULATED
    */


    //private constructor will prevent Driver class to be instantiated
    private Driver(){

    }


    //private instance of Driver cannot be accessed anywhere except this class
    private static Driver driver = new Driver(); //declared encapsulated instance variable
    // private static Driver driver = new Driver(); --> THIS IS ANOTHER WAY TO INITIALIZE THE OBJECT


    //public getter method is the single access point to get Driver object, and it also ensures a second object is not getting instantiated
    public static Driver getDriver(){
        if (driver == null) driver = new Driver();
        return driver;
    }
    // this get(); provides only one single point to get the Object


}
