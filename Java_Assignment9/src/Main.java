import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        Pattern pattern= Pattern.compile("^[A-Z][^\\.]*[^\\.]*\\.$");
        Matcher matcher= pattern.matcher(string);
        boolean result= matcher.matches();
        System.out.println("result "+result);


    }
}
