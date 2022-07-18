import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(number1%2 == 1){
            System.out.println("Weird");
        }
        else if(number1%2==0)
            if(number1>=2 && number1<=5)
                System.out.println("Not Weird");
            else if(number1>=6 && number1<= 20)
                System.out.println("Weird");
            else if(number1>20)
                System.out.println("Not Weird");
        
    }
}
