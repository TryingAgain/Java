import java.io.*;
//import java.lang.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // Take array details
        // Method to collect Size of Array and Array Elements
        Solution collect1 = new Solution();
        int array2 [] = collect1.collectValues();

        //Method to calculate Array's element sum
        int sum1 = collect1.sumOfArr(array2);
        System.out.println(sum1);
    }

    //Method 1 for inputs
    int[] collectValues() {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int arr[] = new int[sizeOfArray];

        String input = scanner1.nextLine();

        StringTokenizer stringToken = new StringTokenizer(input, " ");

        int i =0;

        while(stringToken.hasMoreTokens()) {

            //System.out.println(stringToken.nextToken());
            arr[i] = Integer.parseInt(stringToken.nextToken());
            i++;
            //System.out.println(i);
        }
        // for(int a=0; a<arr.length; a++){
        //   System.out.println(arr[a]);
        // }
        return arr;
    }

    // Method 2 for calculating Array's element Sum
    int sumOfArr(int[] array1) {

        int sum2 = 0;

        //for(int i = 0; i<array1.length; i++) {

        for(int i:array1){
            //System.out.println(sum2);
            //sum2 += array1[i];
            sum2 += i;
            //System.out.println(sum2);
        }
        //System.out.println(sum2);
        return sum2;
    }
}
