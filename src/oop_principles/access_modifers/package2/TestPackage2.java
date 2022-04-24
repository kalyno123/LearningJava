package oop_principles.access_modifers.package2;

import oop_principles.access_modifers.package1.Honda;
//import oop_principles.access_modifers.package1.Tesla;

public class TestPackage2 {
    public static void main(String[] args) {

         Honda h1 = new Honda();
        // Tesla t1 = new Tesla(); -- compiler error bc Tesla is default
        // Honda works here bc the class it was instantiated from is public.
        // Whereas, Telse Class where the object was instantiated from if default

        /* Honda constructor CANNOT be access here in a different package due to being protected
        and was NOT extended(inheritance).
        If it does have inheritance or extends then protected items will be accessible like public. */



    }
}
