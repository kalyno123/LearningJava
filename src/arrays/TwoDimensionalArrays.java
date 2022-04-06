package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] studentGroups = {
                             {"Kaly", "Guluzar", "Melda"},
                             {"Torrie", "David"},
                             {"Abe","Data"}
                             };

        System.out.println(studentGroups[0][1]); // Guluzar
        System.out.println(studentGroups[1][0]); // Torrie
        System.out.println(studentGroups[1][1]); // David

        // HOW TO GET THE SIZE OF THE STUDENT GROUPS?
        System.out.println(studentGroups.length); //3

        //HOW TO GET THE SIZE OF THE SECOND GROUP?
        System.out.println(studentGroups[1].length); //2

        //HOW TO PRINT THIRD GROUP?
        System.out.println(Arrays.toString(studentGroups[2])); // [Abe, Data]

        System.out.println("\n------Printing all groups at once--------\n");
        //HOW TO PRINT ALL THE GROUPS?
        System.out.println(Arrays.deepToString(studentGroups));

        System.out.println("\n------Printing each group members--------\n");
        //HOW TO PRINT EACH GROUP IN SEPARATE LINES?
        // 1ST - WAY:
        System.out.println(Arrays.toString(studentGroups[0]));
        System.out.println(Arrays.toString(studentGroups[1]));
        System.out.println(Arrays.toString(studentGroups[2]));

        System.out.println("\n------Printing each group with for-i loop--------\n");
        // 2ND - WAY:
        for (int i =0; i <studentGroups.length; i++){
            System.out.println(Arrays.toString(studentGroups[i]));
        }

        System.out.println("\n------Printing each group with for each loop--------\n");
        // 3RD - WAY:
        for (String[] studentGroup : studentGroups) {
            System.out.println(Arrays.toString(studentGroup));
        }

        System.out.println("\n------Printing all members with fori loop--------\n");
        // HOW TO PRINT EACH ELEMENT(PERSON) IN THE ENTIRE STUDENT GROUP ARRAY?
        for (int i = 0; i < studentGroups.length; i++){
            for (int j = 0; i < studentGroups.length; i++){
                System.out.println(studentGroups[i][j]);
            }
        }

        /* for example in the first iteration i = 0
        so 1st loop will look through the array and find the first group at 0
        then the 2nd loop will look through the array and find the first element of first group --> KALY
        */

        System.out.println("\n------Printing all members with for each loop--------\n");
        for (String[] group : studentGroups){
            for (String member : group){
                System.out.println(member);
            }
        }








    }
}
