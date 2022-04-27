package exceptions;

public class Example02 {
    public static void main(String[] args) {

        int number = 45;

        System.out.println(number/3); // 15

        try{
            //System.out.println(number/0); // java.lang.ArithmeticException
            System.out.println("abc".charAt(15)); // java.lang.StringIndexOutOfBoundsException
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("end of the program");




    }
}
