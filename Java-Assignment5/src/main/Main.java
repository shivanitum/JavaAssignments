package main;

import data.Data;

public class Main {
    public static void main(String args[])
    {
        Data data=new Data();
        data.print();
       // data.anotherPrint(); variables not initialized
      //  Another another=Another.initialize("testing"); non-static variable referenced from static method
       // another.printAnother();
    }
}
