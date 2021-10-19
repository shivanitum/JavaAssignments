import java.util.HashSet;
import java.util.Scanner;

public class Assignment2 {
   public static boolean check(String s)
   {
       HashSet<Character>hashSet=new HashSet<>();
       for (int i=0; i<s.length(); i++)   //adding all the characters of the string to hashset
       {
           char letter=Character.toLowerCase(s.charAt(i));
           hashSet.add(letter);
       }
       for (char alphabet = 'a'; alphabet <= 'z'; alphabet++)
       {
           if(!hashSet.contains(alphabet))   {
               return false;
           }
       }
       return true;
   }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string");
       String s=sc.next();
       boolean result=check(s);
       if(result==true)
           System.out.println("String contains all the alphabets");
       else
           System.out.println("String doesn't contain all the alphabets");
    }
}
