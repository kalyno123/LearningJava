package javaMemoryManagement;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer("Hello");

        buff.setCharAt(2, 'X');
        System.out.println(buff); // HeXlo

        buff.reverse();
        System.out.println(buff); // olXeH

        buff.insert(0, "Hey");
        System.out.println(buff); // HeyolXeH






    }
}
