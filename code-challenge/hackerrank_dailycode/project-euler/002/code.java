import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int max = sc.nextInt();
    	while(max-->0) {
    		System.out.println(fibo(sc.nextLong()));	
    	}
    }
    
    public static long fibo(long max) {
    	long sum = 2;
    	long smaller = 2;
    	long bigger= 3;
    	long temp = 0;
    	
    	while(bigger < max) {
    		if(smaller%2!=0 && bigger%2!=0) {
    			if(smaller + bigger <max)
    				sum = sum + (smaller+bigger);
    			else
    				return sum;
    		}
    		
    		temp = bigger;
    		bigger = smaller + bigger;
    		smaller = temp;
    	}
    	return sum;
    }
}