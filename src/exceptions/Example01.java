package exceptions;

public class Example01 {
    public static void main(String[] args) {

        // HANDLE THE UNCHECKED/RUNTIME EXCEPTION BELOW AND REPORT WITH A MESSAGE

        String[] names = {"Alex", "John", "Max"};
        try {
            System.out.println(names[-5]); // java.lang throws ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException aioobe){// ArrayIndexOutOfBoundsException OR CAN BE ITS PARENT -- IndexOutOfBoundsException -- Exception -- Throwable; Typically Exception is used
            // System.out.println("ArrayIndexOutOfBoundsException is thrown here!");
            // System.out.println(aioobe);
            aioobe.printStackTrace(); // the proper way to report the exception message
        }
        System.out.println("end of the program");






    }
}
