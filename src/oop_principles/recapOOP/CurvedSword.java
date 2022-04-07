package oop_principles.recapOOP;

public class CurvedSword {

    //static code block below: (executed once BEFORE everything including main();)
    static {
        System.out.println("Starting furnace ...");
    }

    //non-static code block below:
    //(executed amount depends on how many objects was instantiated from the class)
    {
        System.out.println("Heating up the material ...");
        System.out.println("The curved sword is created!");
    }


    public CurvedSword(){

    }

    public CurvedSword(String color, String material, String sharpness, double weight, double price){
        this.color = color;
        this.material = material;
        this.sharpness = sharpness;
        this.weight = weight;
        this.price = price;
    }

    public CurvedSword(String material){
        this.material = material;
    }


    public String color;
    public String material;
    public final static String handle = "T shape handle";
    public String sharpness;
    public static String size = "Medium";
    public double weight;
    public double price;


    // create methods have to consider is the behavior coming from the object or the class
    public void slash(){
        System.out.println(material + " Sword slashes");
    }

    public void cut(){
        System.out.println(material + " Sword cuts");
    }

    public void cut(boolean isSharp){
        System.out.println((isSharp) ? "The cut is deep" : "There is no cuts made");
    }

    public static CurvedSword creatingSword(String material){
        //CurvedSword sword = new CurvedSword();
        //sword.material = material;
        return new CurvedSword(material);
    }

    @Override
    public String toString() {
        return "CurvedSword{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", sharpness='" + sharpness + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }










}




