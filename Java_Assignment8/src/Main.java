import java.io.*;
import java.util.*;
public class Main {
    public static void throwExceptions(String s) throws MyException1,MyException2,MyException3 {
        if(s.equals("one"))
        {
            throw new MyException1();
        }
        else if(s.equals("two"))
            throw new MyException2();
        else
            throw new MyException3();

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            throwExceptions(s);
        }
        catch (MyException1|MyException2|MyException3 m)
        {
            System.out.println("Caught all exceptions");
        }
        finally
        {
            System.out.println("IN finally block");
        }
    }
}
