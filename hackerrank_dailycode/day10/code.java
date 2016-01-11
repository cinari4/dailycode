import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        
        int[] inputVal = new int[n];
        
        // input value
        for(int i=0;i<n;i++)
        	inputVal[i] = in.nextInt();
        
        for(int i=0;i<n;i++)
        	System.out.println(getBinary(inputVal[i]));
    }
    
    public static String getBinary(final int i) {
    	StringBuilder sb = new StringBuilder();
    	int val = i;
    	while(true) {
    		if(val<=1) {
    			sb.append(val);
    			break;
    		}
    		sb.append(val%2);
    		val = val/2;
    	}
    	return sb.reverse().toString();
    }
}
