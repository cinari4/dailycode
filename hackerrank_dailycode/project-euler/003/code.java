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
        
        if(checkPrime(max))
            return max;
        
        for(long i=2;i<=max;i++) {
            if(max%i==0) {
                long temp = max/i;
                if(checkPrime(temp))
                    return temp;
            }
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