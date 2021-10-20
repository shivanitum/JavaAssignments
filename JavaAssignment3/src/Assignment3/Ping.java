//Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
package Assignment3;
import java.io.*;
import java.util.*;
public class Ping {
    public static void pingHost(String command) throws Exception{

        int numCount = 0;
        double[] responseTimes = new double[10];  //used to store the response times of  ping
        try {
            Process p = Runtime.getRuntime().exec(command);  //starts the process of pinging the host
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));  //used for reading inputs from the process
            String s = "";
            while ((s = bufferedReader.readLine()) != null && numCount< 10) {  //stores each line of input into the string
                System.out.println(s);
                int start = s.lastIndexOf("=");
                int end = s.lastIndexOf("ms");
                if (start != -1 && end != -1) {
                    double time = Double.parseDouble(s.substring(start+1, end-1)); //substring takes the value of response time from the string
                    responseTimes[numCount++] = time;

                }
            }
            Arrays.sort(responseTimes);
            System.out.println("Median Time to ping : " + (responseTimes[4] + responseTimes[5]) / 2);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String hostName = sc.next();
        pingHost("ping " + hostName);
    }
}