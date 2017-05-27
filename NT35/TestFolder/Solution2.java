import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        // Method to calculate fraction value
        float [] returnedOutput = new Solution2().calci(arr);
        for(float i: returnedOutput) {

            DecimalFormat df = new DecimalFormat("#.####");
            System.out.println(df.format(i));
        }

    }

    float[] calci(int[] array1) {

        int positiveValue = 0;
        int zeroCount = 0;
        int negValue = 0;

        for(int i: array1) {

            if (i> 0) {

                positiveValue += 1;

                //System.out.println(positiveValue);
                //System.out.println(i);
            }

            else if (i<0) {

                negValue += 1;
                //System.out.println(negValue);
                //System.out.println(i);
            }

            else {

                zeroCount +=1;
                //System.out.println(zeroCount);
                //System.out.println(i);
            }

            //System.out.println(positiveValue + "   " + negValue + "  " + zeroCount);

        }

        //System.out.println(positiveValue + "   " + negValue + "  " + zeroCount);

        float avpositiveValue =(float) (positiveValue)/array1.length;
        float avnegValue = (float)(negValue)/array1.length;
        float avzeroCount = (float)(zeroCount)/array1.length;

        System.out.println(avpositiveValue + "   " + avnegValue + "  " + avzeroCount);

        float retValue [] = {avpositiveValue, avnegValue, avzeroCount};

        return retValue;
    }
}
