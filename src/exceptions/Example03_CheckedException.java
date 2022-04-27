package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) throws InterruptedException { // <-- 2ND WAY TO HANDLE EXCEPTION: ADDING TO METHOD SIGNATURE

        /* Checked exceptions are also known as compile-time exceptions:
         - These kinds of exceptions must be handled before a program is run.
         - Our program will not compile until checked exception is handled.
        */

        /* System.out.println("\n-----1ST WAY TO HANDLE EXCEPTION: USING TRY-CATCH BLOCKS------\n");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000); // 2000 millisecond = 2 second -- sleep(); method slows the execution speed down by how many millisecond you pass
                System.out.println(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("end of the program");
        */

        //2ND WAY IS ADDING EXCEPTION TO THE METHODS SIGNATURE USING THROWS KEYWORD
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000); // 2000 millisecond = 2 second -- sleep(); method slows the execution speed down by how many millisecond you pass
            System.out.println(i);
        }

        Thread.sleep(2000);
        System.out.println("end of the program");




    }
}
