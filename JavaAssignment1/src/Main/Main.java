/*
Create a java program to search through the home directory and look for files that match a regular expression.
The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
 */
package Main;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String args[])
    {
        File directory = new File("/home/sivant/Documents");    //sets the directory to search in
        Pattern pattern= Pattern.compile(".*\\.txt");  // pattern- ending with .txt
        File[] fileList = directory.listFiles();   //lists all the files in the directory
        if(fileList.length>0)
         {
             for(File file:fileList)
             {
                 Matcher matcher= pattern.matcher(file.getName());
                 if(matcher.matches())                  //returns true if the filename matches regex
                 {
                     System.out.println(file.getName()+" path is "+file.getAbsolutePath());   //prints the path of the filenames matched
                 }
             }

         }
    }
}
