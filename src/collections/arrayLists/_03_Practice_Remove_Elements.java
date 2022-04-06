package collections.arrayLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {

        List<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        System.out.println("\n-----TASK 1------\n");
    /* TASK 1:
    Remove Python from the list and print it
    [Java, JavaScript, C#, C++]
    */
        languages.remove("Python");
        System.out.println(languages);

        System.out.println("\n-----TASK 2------\n");
    /* TASK-2:
    Remove all elements that start with J
    RESULT:
    [C#, C++]
    */
        //ONE WAY TO DO TASK:
        List<String> jLanguages = new LinkedList<>();
        for (String element : languages){
            if (element.startsWith("J")) {
                jLanguages.add(element);
            }
        }
        languages.removeAll(jLanguages);
        System.out.println(languages);


        //AKIN'S WAY -- BEST SOLUTION TO REMOVE:
        languages.removeIf(element -> element.startsWith("J"));
        System.out.println(languages);

        // USING ITERATOR:
        Iterator<String> iterator = languages.iterator(); // putting elements from 'languages' LinkedList into a queue
        while(iterator.hasNext()){ // READ AS: "while iterator has next ... get next element"
            String element = iterator.next(); // iterator.next(); --> this is getting next element from queue
            if(element.startsWith("J")) iterator.remove(); // if and when the condition is met then remove that matched element
        }
        System.out.println(languages);


        /* KEREM'S SOLUTION: (this will work, but it is NOT PREFERRED)
        for (int i = 0; i < languages.size(); i++){
            if (languages.get(i).toLowerCase().charAt(0) == 'j'){
                languages.remove(languages.get(i));
                i--;
            }
        }
        System.out.println(languages);
        */

        /* DO NOT USE FOR EACH LOOP W/ REMOVE();
        for (String language : languages) {
            if(language.startsWith("J")) languages.remove(language); // java.lang will throw: ConcurrentModificationException
        }
        System.out.println(languages);
        */




    }
}
