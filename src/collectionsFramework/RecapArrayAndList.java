package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* TASK 1:
    Create an int array to store 1, 5, 7, 9, 10. Then, print the array.
    */
        int[] numbers = {1, 5, 7, 9, 10}; // note: 'null' is not allowed since it is a primitive array
        System.out.println(Arrays.toString(numbers)); // [1, 5, 7, 9, 10]

        System.out.println("\n-----TASK 2------\n");
    /* TASK 2:
    Create a String array to store cities as below:
    Tokyo
    Berlin
    Oslo
    Denver
    null
    null
    Then, print the array
    */
        String[] cities ={"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities)); // [Tokyo, Berlin, Oslo, Denver, null, null]


        ArrayList<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        //Collection<String> name3 = new ArrayList<>();
        //Iterable<String> name4 = new ArrayList<>();
        //Object name5 = new ArrayList<>();
        //^^ ARRAYLIST OBJECT CAN BE CREATED IN MANY FORMS -- HOWEVER ITS OWN FORM IS THE BEST AS IT WILL HAVE THE MOST INHERITED METHOD FROM ALL ITS PARENT

    /* CREATE BELOW COLLECTIONS:
    List: ArrayList - Vector - LinkedList
    */
        System.out.println("\n-----ArrayList<String>-----\n");
        ArrayList<String> towns = new ArrayList<>();
        Collections.addAll(towns, cities);
        towns.add("Tokyo");

        System.out.println(towns); // [Tokyo, Berlin, Oslo, Denver, null, null, Tokyo]
        System.out.println(towns.get(3)); // Denver

        System.out.println("\n-----Vector<String>-----\n");
        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size()); // 6
        names.forEach(element -> System.out.println(element));
        System.out.println("Name at index of 5 = " + names.get(5)); // Name at index of 5 = Data

        System.out.println("\n-----LinkedList<String>-----\n");
        LinkedList<String> object1 = new LinkedList<>(); // TO NOT LOSE ANY DATA(METHODS) CREATE OBJECT IN IT OWN FORM
        List<String> object2 = new LinkedList<>(); // Since Object is being created in the shape of it's parent --> IT WILL LOSE SOME OF ITS CLASS MEMBERS (i.e. methods)

        object1.add("Phone");
        object1.add("Computer");
        object1.add("Airpods");
        object1.add("Screen");
        object1.add("Screen");
        object1.add(null);
        object1.add(null);
        object1.add(null);
        object1.add(null);

        System.out.println(object1.getLast()); // null
        System.out.println(object1); // [Phone, Computer, Airpods, Screen, Screen, null, null, null, null]
        System.out.println(object1.stream().filter(element -> element == null).count()); // 4; CAN ALSO BE: object1.stream().filter(Objects::isNull).count();
        // REMEMBER COUNT(); RETURNS A LONG SO IF YOU WANT TO RETURN INT THEN HAVE TO CAST (INT)




    }
}
