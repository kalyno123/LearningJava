package singleton;

public class DriverTest {
    public static void main(String[] args) {

        /* THESE ARE NOT POSSIBLE ANYMORE SINCE DRIVER CONSTRUCTOR IS PRIVATE
        Driver d1 = new Driver();
        Driver d2 = new Driver();

        System.out.println(d1); // singleton.Driver@1540e19d -- these are different objects, and they are both stored in the Heap
        System.out.println(d2); // singleton.Driver@677327b6
        */


        System.out.println(Driver.getDriver()); // singleton.Driver@1540e19d
        System.out.println(Driver.getDriver()); // singleton.Driver@1540e19d
        // if object is initialized then it'll return null
        // everytime same object is being created it becomes a new object w/ diff address



    }
}
