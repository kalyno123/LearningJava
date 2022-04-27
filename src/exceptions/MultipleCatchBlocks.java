package exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {


        try {
            System.out.println(3/0);
            System.out.println("Hello".charAt(1000));
        }catch (StringIndexOutOfBoundsException se){
            se.printStackTrace();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        /* Multiple Exceptions and Multiple Catch Blocks:
        Instead of above 2 catch blocks we use just one catch block, and we handle all exception with the parent Exception.
        */
        System.out.println("end of the program");




    }
}
