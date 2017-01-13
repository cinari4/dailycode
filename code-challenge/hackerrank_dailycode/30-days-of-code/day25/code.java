import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[])
	{
	      Scanner sc=new Scanner(System.in);
	      int T=sc.nextInt();
	      StringBuilder sb = new StringBuilder();
	      
	      while(T-->0){
	    	  int data = sc.nextInt();
	    	  checkPrime(data, sb);
	      }
	      if(sb.toString().length() != 0)
	    	  System.out.println(sb.toString());
	}

	private static void checkPrime(int n, StringBuilder sb)
	{
		if(n == 1) {
			sb.append("Not prime\n");
			return;
		}
		
		int count = 0;
		int maxD = (int)Math.sqrt(n);
		
		if(maxD > 10000) {
			for(int i = 2; i <= maxD/2; i++) {
		    	if(n%i == 0) {
		    		sb.append("Not prime\n");
		    		return;			  
		    	}

		    }
		} else {
			for(int i = 2; i <= n/2; i++) {
		    	if(n%i == 0) {
		    		sb.append("Not prime\n");
		    		return;			    		
		    	}
		    }
		}
		
		sb.append("Prime\n");
		return;
	}
}
		
		