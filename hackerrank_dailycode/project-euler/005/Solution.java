import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int max = sc.nextInt();
    	while(max-->0) {
    		System.out.println(getSmallestMultiple(sc.nextInt()));
    	}
    }
    
    private static int getSmallestMultiple(int num) {
    	if(num==1)
    		return 1;
    	
    	int divide = 2;
    	
    	while(true) {
    		if(isSmallestMultiple(num, divide))
    			return divide;
    		divide++;
    	}
	}

    private static boolean isSmallestMultiple(int num, int divide) {
    	for(int i=1; i<=num; i++) {
            if(divide%i!=0) {
            	return false;
            }
    	}
    	return true;
    }
    
}