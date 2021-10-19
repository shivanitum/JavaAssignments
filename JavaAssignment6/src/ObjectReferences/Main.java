package ObjectReferences;
import java.util.*;
public class Main {
    Main(String string)
    {
        System.out.println(string);
    }
    public static void main(String args[])
    {
        Main main[]=new Main[2];
        for(int i=0;i<2;i++)
        {
            System.out.println(main[i]);
        }
        Main m[]={new Main("cat"),new Main("dog")};
        System.out.println(m[0]+" "+m[1]);
    }
}
