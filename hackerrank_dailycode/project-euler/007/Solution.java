import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int max = sc.nextInt();
    	
    	HashMap<Long, Long>primeMap = new HashMap<Long, Long>();
    	generateHashMap(primeMap);
    	
    	while(max-->0) {
    		System.out.println(getWherePrime(sc.nextLong(), primeMap));
    	}
    	
    }

	private static long getWherePrime(long num, HashMap<Long, Long>primeMap) {
		if(primeMap.containsKey(num))
			return primeMap.get(num);
		return 0;
	}

	private static void generateHashMap(HashMap<Long, Long> primeMap) {
		long cntHashMap = 1;
		long i=2;
		while(cntHashMap <=100000) {
			if(checkPrime(i)) {
				primeMap.put(cntHashMap, i);
				cntHashMap++;
			}
			i++;
		}
	}
	
    private static boolean checkPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3 || n == 5) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;    
    }
    
}