package singleton;

public class Another {
    String string1;
  /*  public static Another initialize(String string)
    {
        string1=string;
         return new Another(); Non static variable string1 can't be referenced from static method
    }*/
    public void printAnother()
    {
        System.out.println(string1);
    }
}
