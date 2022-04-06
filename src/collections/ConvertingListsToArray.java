package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToArray {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");

        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(30);

        Vector<Boolean> booleans = new Vector<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        System.out.println("\n-----CONVERTING LISTS TO ARRAY------\n");
        //ONE WAY - MANUAL:
        String[] namesArr1= new String[names.size()];
        for (int i = 0; i < names.size(); i++){
            namesArr1[i] = names.get(i);
        }
        System.out.println(Arrays.toString(namesArr1));


        //ANOTHER WAY USING A METHOD:
        Object[] namesArr2 = names.toArray();
        Object[] agesArr2 = names.toArray();
        Object[] booleansArr2 = names.toArray();
        /* Object is the parent to everything in java ... that's why anything can be converted to Object ... all child can take shape of Object
        HOWEVER, not everything is an object ... primitives can not take shape of be converted as implicitly to Objects
        */

        System.out.println(Arrays.toString(namesArr2));
        System.out.println(Arrays.toString(agesArr2));
        System.out.println(Arrays.toString(booleansArr2));







    }
}
