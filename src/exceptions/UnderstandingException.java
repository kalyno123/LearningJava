package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {

        // UNCHECKED EXCEPTION = RUNTIME EXCEPTION: are the exceptions that will compile fine, but you get when you run the program
        String name = "John";

        //HOW TO HANDLE THE EXCEPTION
        try {
            System.out.println(name.charAt(10)); // java.lang throws StringIndexOutOfBoundsException
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("an exception is here!");
        }
        System.out.println("end of the program");



    }
}
