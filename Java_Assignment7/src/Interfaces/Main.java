package Interfaces;

public class Main extends Concrete implements Combined{
    @Override
    public void myOwn() {
    }
    @Override
    public void I1method1() {
    }
    @Override
    public void I1method2() {
    }
    @Override
    public void I2method1() {
    }
    @Override
    public void I2method2() {
    }
    @Override
    public void I3method1() {
    }
    @Override
    public void I3method2() {
    }
    public void method1(Interface1 interface1)
    {
        System.out.println("Method 1");
    }
    public void method2(Interface2 interface2)
    {
        System.out.println("Method 2");
    }
    public void method3(Interface3 interface3)
    {
        System.out.println("Method 3");
    }
    public void method4(Combined combined)
    {
        System.out.println("Method 4");
    }
    public static void main(String args[])
    {
        Main main=new Main();
        main.method1(main);
        main.method2(main);
        main.method3(main);
        main.method4(main);

    }

}
