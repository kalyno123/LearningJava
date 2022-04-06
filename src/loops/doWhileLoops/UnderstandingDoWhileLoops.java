package loops.doWhileLoops;

import java.util.Random;

public class UnderstandingDoWhileLoops {
    public static void main(String[] args) {

        Random random = new Random();
        boolean b = random.nextBoolean(); // random true or false

        while (b){
            System.out.println("it is true");
            b = random.nextBoolean();
        }
        System.out.println("end of the program");

        boolean b2 = false;
        do{
            System.out.println("true");
        }while(b2);





    }
}
