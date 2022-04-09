package javaMemoryManagement;

public class Dog {

    public String breed;
    public int age;

    // right-click > generate > override method > select finalize > OK
    @Override
    protected void finalize(){
        System.out.println("A dog object is garbage collected.");
    }
    // THIS METHOD WILL EXECUTE WHENEVER A DOG OBJECT LOSES ITS REFERENCE.




}
