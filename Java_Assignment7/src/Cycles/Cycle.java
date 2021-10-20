package Cycles;

public class Cycle {
    Cycle()
    {
       System.out.println("In cycle class");
    }
    public static void main(String args[]) 
    {
        Cycle unicycle=new Unicycle();
        Cycle bicycle=new Bicycle();
        Cycle tricycle=new Tricycle();
        Cycle cycles[] = {unicycle,bicycle,tricycle};
        System.out.println("After upcasting");
        for(int i=0;i<3;i++)
        {
            cycles[i].balanceMethod();
        }
       Unicycle u=(Unicycle)unicycle;
        Bicycle b=(Bicycle)bicycle;
        Tricycle t=(Tricycle) tricycle;
        System.out.println("After downcasting");
        u.balanceMethod();
        b.balanceMethod();
        t.balanceMethod();

    }

    public void balanceMethod() {
        System.out.println("Balance in cycle");
    }
}
