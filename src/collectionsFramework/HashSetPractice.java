package collectionsFramework;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<Integer> numbers1 = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>(); // Since Object is being created in the shape of it's parent --> IT WILL LOSE SOME OF ITS CLASS MEMBERS (i.e. methods)
        numbers1.add(5);
        numbers1.add(10);
        numbers1.add(10); // HashSet comes from Set. Therefore, it will not allow duplicates.
        numbers1.add(-3);
        numbers1.add(0);
        numbers1.add(7);
        numbers1.add(-55);

        // THERE IS NO INSERTION ORDER SO NUMBERS WILL PRINT IN RANDOM ORDER; THEREFORE, THERE IS NO METHODS THAT USES INDEX.
        // THE PURPOSE OF NOT HAVING INSERTION ORDER AND NOT ALLOWING DUPLICATES IS BC THE COLLECTION SHOULD BE UNIQUE
        System.out.println(numbers1); // [0, -3, 5, -55, 7, 10]






    }
}
