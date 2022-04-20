package oop_principles.inheritance;

public class Food {

    //INSTANCE VARIABLE
    public static final boolean isTangible = true;

    public String taste;
    protected String name;
    boolean isSpicy;
    private boolean isOrganic;

    // GETTERS AND SETTERS
    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    // OVERRIDE toString();
    @Override
    public String toString() {
        return "Food{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic +
                '}';
    }
}
