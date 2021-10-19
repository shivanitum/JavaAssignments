package VampireNumber;
import java.util.*;
public class VampireNumber
{
    private static int numOfDigits(long num)
    {
        return Long.toString(Math.abs(num)).length();

        // alternate solution

        /*int sum=0;
        while(num>0)
        {
            sum++;
            num/=10;
        }
        return sum;*/

    }

    private static boolean fangCheck(long orig, long fang1, long fang2)
    {
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")){//checks for trailing zeroes
            return false;
        }

        int origLen = numOfDigits(orig);
        if(numOfDigits(fang1) != origLen / 2 || numOfDigits(fang2) != origLen / 2) { //each fang should have half of the digits in the original number
            return false;
        }
        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(fang1) + Long.toString(fang2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }

    public void printVampireNumber(){
        int count = 0;
        for (long i = 10; count <= 100; i++) {
            if ((numOfDigits(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long fang1=2;fang1<=Math.sqrt(i)+1;fang1++) {   //first factor of the original number
                if (i % fang1 == 0){
                    long fang2 = i / fang1;                         // second factor of the number
                    if (fangCheck(i, fang1, fang2) && fang1 <= fang2) {   // checks if the factors satisfy the criteria of fangs of vampire number
                        System.out.println(i + ": [" + fang1 + ", " + fang2 + "]"); // printing the fangs of the vampire number and the number
                        count += 1;  //
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        VampireNumber vm=new VampireNumber();
        vm.printVampireNumber();
    }
}
