import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cntTest = sc.nextInt();
        
        for(int i=0; i<cntTest; i++) {
        	findTheBeast(sc.nextInt());
        }
    }
    
    public static void findTheBeast(int digit) {
    	
    	if(digit<3) {
    		System.out.println("-1");
    		return;
    	}
    	
		if(digit%3==0) {
			System.out.println(makeIntWithDigit(3, digit/3));
			return;
		}
    
		for(int i=digit/3; i>0; i--) {
			if( (digit-(3*i)) %5 == 0) {
				System.out.println(makeIntWithDigit(3, i) + makeIntWithDigit(5, (digit-(3*i))/5)); 
				return;
			}
		}
		
		if(digit%5==0) {
			System.out.println(makeIntWithDigit(5, digit/5));
			return;
		}
		
		System.out.println("-1");
    }
	
	private static String makeIntWithDigit(int num, int cnt) {
		StringBuilder sb = new StringBuilder();
		if(num==3) {
			for(int i=0; i<cnt; i++)
				sb.append("555");
				
		} else if(num==5) {
			for(int i=0; i<cnt; i++)
				sb.append("33333");
		}
			
		return sb.toString();
	}
}
        