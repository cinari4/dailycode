import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        
        for(int i=0; i<T; i++) {
            int temp = sc.nextInt();
            long three = (temp-1)/3;
            long five = (temp-1)/5;
            long fifteen = (temp-1)/15;
            long total = 3*(three*(three+1)/2) + 5*(five*(five+1)/2) - 15*(fifteen*(fifteen+1)/2);
            BigInteger sum = new BigInteger(String.valueOf(total));
            
            System.out.println(sum);
        }
        
    }
}