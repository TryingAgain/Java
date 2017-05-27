import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //Method to print staircase
        new Solution3().drawin(n);
    }

    void drawin(int n) {

        String [][] arr = new String [n][n];

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length; j++){

                arr[i][j]=" ";

            }

        }

        for(int i=0; i<arr.length;i++){

          for(int j=arr[i].length-1;j>arr[i].length-(i+2);j--){

                arr[i][j]="#";
          }
        }

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length; j++){

                System.out.print(arr[i][j]);

            }

            System.out.println();

        }

    }
}
