import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int max = sc.nextInt();
    	
    	while(max-->0) {
    		System.out.println(sumDifference(sc.nextLong()));
    	}
    	
    }
    
    private static long sumDifference(long num) {
    	return getPlusSquare(num) - getSquarePlus(num);
    	
    }

	private static long getSquarePlus(long num) {
		long sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i*i;
		}
		return sum; 
	}

	private static long getPlusSquare(long num) {
		long sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		return sum*sum; 
	}
}