import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine().trim());
        if(number>=2 && number<=20){
            for(int i=1; i<=10; i++){
                int numberIn = number;
                int result = number *i;
                System.out.printf("%s x %s = %s\n",numberIn,i,result);
                //System.out.println("\n");
                
            }
        }

        bufferedReader.close();
    }
}
