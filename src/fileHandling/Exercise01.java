package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        /* TASK 1:
        Create a new txt file called objects. Write below data in it:
            Computer
            Phone
            Table
            Chair
            Mouse
            Screen
            Remote
        - Print objects that has r or R as a letter
        EXPECTED OUTPUT:
            Computer
            Chair
            Screen
            Remote
         */
            File file = new File("objects.txt");

            try{
                FileWriter fileWriter = new FileWriter("objects.txt");
                fileWriter.write("Computer\n");
                fileWriter.write("Phone\n");
                fileWriter.write("Table\n");
                fileWriter.write("Chair\n");
                fileWriter.write("Mouse\n");
                fileWriter.write("Screen\n");
                fileWriter.write("Remote");
                fileWriter.close();

                Scanner scan = new Scanner(file);

                while (scan.hasNextLine()){
                    String next = scan.nextLine();
                    if (next.toLowerCase().contains("r")) System.out.println(next);
                }

            }
            catch(Exception e){
              e.printStackTrace();
            }
            finally {
                file.delete();
            }








    }
}
