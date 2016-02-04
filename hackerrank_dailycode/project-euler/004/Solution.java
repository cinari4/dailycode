import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int max = sc.nextInt();
    	while(max-->0) {
    		System.out.println(getMaxPalindromic(sc.nextInt()));
    	}
    }
    
    private static int getMaxPalindromic(int num) {
    	int max =Integer.MIN_VALUE;
    	for(int i=999; i>=100; i--) {
    		for(int j=999; j>=100; j--) {
				Integer temp = i*j;
				if(temp>num)
					continue;
				
				if(isPalindromic(String.valueOf(temp))) {
					max = Math.max(temp,max);
				}
    		}
    	}
    	return max;
    }
    
	private static boolean isPalindromic(String num) {
		if(num.length()!=6)
			return false;
		
		char[] frontNum = num.substring(0, 3).toCharArray();
		char[] behindeNum = num.substring(3, num.length()).toCharArray();
		if(frontNum[2] == behindeNum[0]) {
			if(frontNum[1] == behindeNum[1]) {
				if(frontNum[0] == behindeNum[2]) {
					return true;
				}
			}
		}
		return false;
	}
    
}