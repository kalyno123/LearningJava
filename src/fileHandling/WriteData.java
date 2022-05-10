package fileHandling;

import java.io.File;
import java.io.FileWriter;

public class WriteData {
    public static void main(String[] args) {

    /* TASK 1:
    Create a file called as studentList.txt
    After creating, put a wait for 5 seconds, and delete it
    */
        File myFile = new File("studentList.txt");
        try{
            myFile.createNewFile();
            Thread.sleep(5000); // 5second
            // System.out.println("Hello".charAt(10)); --> exception

            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Kaly\n");
            fileWriter.write("Data\n");
            fileWriter.write("Regina");
            fileWriter.close(); // this method will save the file

            Thread.sleep(5000); // 5second

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(myFile.delete()); //true; even w/ exception file will still be deleted bc finally block always run no matter what
        }
        System.out.println("End of the program!");




    }
}
