package Overloaded;

public class Class1 {
    Class1()
    {
        System.out.println("First constructor");
        new Class1(5);
    }
    Class1(int number)
    {
        System.out.println("Second constructor");

    }
    public static void main(String args[])
    {
        Class1 class1=new Class1(5);
    }
}
