import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        while(max-->0) {
            System.out.println(getMaxPrime(sc.nextLong())); 
        }
    }
    
    public static long getMaxPrime(long max) {
        for(long i=max; i>2;) {
            if(max%i==0 && i%2!=0) {
                if(checkPrime(i))
                    return i;
            }
            if(i%2!=0)
                i=i-2;
            else
                i=i-1;
        }
        return 2;
    }

    private static boolean checkPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;    
    }
}