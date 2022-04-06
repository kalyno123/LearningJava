package learningObjects;

import java.sql.SQLOutput;

public class LearningConcatMethod {
    public static void main(String [] args){

        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global;
        String schoolName2 = tech.concat(global); // this used the concat method instead of '+'

        System.out.println(schoolName1 + "\n" + schoolName2);

        //Kaly Ngo
        String myFirstName = "Kaly";
        String myLastName = "Ngo";
        String fullName1 = myFirstName.concat(" " + myLastName);


    }
}
