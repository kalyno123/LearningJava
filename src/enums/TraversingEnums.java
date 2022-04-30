package enums;

public class TraversingEnums {
    public static void main(String[] args) {
        System.out.println("\n===DAYS OF THE WEEK===");
        for (Day_ element : Day_.values()){
            System.out.println(element);
        }

        System.out.println("\n===MONTHS OF THE YEAR===");
        for (Day.Month element : Day.Month.values()){
            System.out.println(element);
        }


    }
}
