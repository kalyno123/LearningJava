package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class ReadData {
    public static void main(String[] args) {

        /* TASK 1:
        1. create a new text file called shoppingList. Write all items below:
        Ice-cream
        Fruits
        Pen
        Paper
        Milk
        */
            File myFile = new File("shoppingList.txt");

            try {
                FileWriter fileWriter = new FileWriter("shoppingList.txt");
                fileWriter.write("Ice-cream\n");
                fileWriter.write("Fruits\n");
                fileWriter.write("Pen\n");
                fileWriter.write("Paper\n");
                fileWriter.write("Milk");
                fileWriter.close(); // saving file
                Thread.sleep(1000);

                //HOW TO READ INFORMATION FROM A FILE:
                Scanner scan = new Scanner(myFile);

                // ONE WAY TO READ FILE USING FOR-I LOOP:
                for (int i = 1; scan.hasNextLine(); i++){// TERMINATION POINT TAKES ANY BOOLEAN IT DOESN'T HAVE TO BE NUMBERS
                    Thread.sleep(1000);
                    System.out.println("Item " + i + " = " + scan.nextLine());
                }

                /* ANOTHER WAY TO READ FILE USING WHILE LOOP:
                int index = 1;
                while (scan.hasNextLine()){
                    System.out.println("Item " + index++ + " = " + scan.nextLine());
                }
                */

            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                myFile.delete();
            }






    }
}
