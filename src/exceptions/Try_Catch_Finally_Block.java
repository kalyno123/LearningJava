package exceptions;

public class Try_Catch_Finally_Block {
    public static void main(String[] args){

        //THIS IS A CHECKED/COMPILER TIME EXCEPTION
        try{
            System.out.println(0/3);// 3
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{// codes inside finally will ALWAYS execute no matter if there's an exception or not
            System.out.println("This is the finally block");
        }
        System.out.println("end of the program");



    }
}
