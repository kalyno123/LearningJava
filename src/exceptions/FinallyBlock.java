package exceptions;

import java.util.ArrayList;

public class FinallyBlock {
    public static void main(String[] args) {

        // THIS IS AN UNCHECKED/RUNTIME EXCEPTION
        try{
            ArrayList<String> objects = new ArrayList<>();
            objects.add("Computer");
            objects.add("Mouse");
            objects.add("MousePad");

            for (String element : objects){
                objects.remove(element);// java.util.ConcurrentModificationException
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {// <-- FINALLY DOES NOT HANDLE THE EXCEPTION BUT IT'LL ALWAYS RUN THE BLOCK OF CODE EVEN THOUGH THERE IS AN EXCEPTION OR NOT
            System.out.println("Hello, here is the exception report!");
        }
        System.out.println("end of the program");



    }
}
