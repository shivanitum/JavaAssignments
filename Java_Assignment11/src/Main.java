import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
public class Main {
    static HashMap<Character,Integer> hashMap=new HashMap<>();
    public static void storeCharactersInHashmap(StringBuilder string)
    {
        for(int i=0;i<string.length();i++)
        {
            if(!hashMap.containsKey(string.charAt(i)))
            {
                hashMap.put(string.charAt(i),1);
            }
            else
            {
                int count= hashMap.get(string.charAt(i));
                hashMap.put(string.charAt(i),count+1);
            }
        }
    }
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("/home/sivant/Documents/text"));
          File file=new File("/home/sivant/Documents/result");
        PrintStream stream = new PrintStream(file);
        while(sc.hasNextLine())
        {
            StringBuilder s=new StringBuilder(sc.nextLine());
            storeCharactersInHashmap(s);
        }
        System.setOut(stream);
        for (char key: hashMap.keySet()) {
            System.out.println(key + "=" + hashMap.get(key));
        }

    }
}
