package fileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {

        // To create a file we use some classes
        File myFile = new File("myFirstFile.xls");

        try {
            System.out.println("Checking if exists before creating file = " + myFile.exists()); // false
            System.out.println(myFile.createNewFile()); // true
            System.out.println("Checking if exists after creating file = " + myFile.exists()); // true
            System.out.println("File name is = " + myFile.getName());
            System.out.println("Absolute path of the file = " + myFile.getAbsolutePath());
            System.out.println("Can file write = " + myFile.canWrite());
            System.out.println("Can file read = " + myFile.canRead());
            System.out.println("Size of the file = " + myFile.length());

            //myFile.createNewFile(); --> creates a new file -- initially it'll a checked exception -- to handle it add (throws IOException) or try-catch
            // createNewFile(); returns a boolean so if there's a file already created of it then it'll return false and not create otherwise it creates a new file and return true

            Thread.sleep(5000);

            System.out.println(myFile.delete()); // true

        }catch (Exception ioe){
            ioe.printStackTrace();
        }
        System.out.println("end of the program");




    }
}
