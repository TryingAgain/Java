import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        char ch = time.charAt(8);
        StringBuilder str = new StringBuilder(time);

        if(ch=='A'){

            System.out.println(str.substring(0,8));
        }

        if(ch=='P') {

            String st = str.substring(0,2);
            int time1 = Integer.parseInt(st);

            if(time1==12){

                System.out.println(str.substring(0,8));
            }

            else if(time1!=12){
                time1 += 12;

                String s1 = Integer.toString(time1);

                System.out.println(s1+str.substring(2,8));
            }
        }


    }
}
