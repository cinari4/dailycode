import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	// 1*7
	public static final int MIN_SUM_HOURGLASS = 7;
	// 9*7
	public static final int MAX_SUM_HOURGLASS = 63;
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int max=0;
        int temp=0;
        
        for(int i=1; i<=4; i++) {
        	for(int j=1; j<=4; j++) {
        		if(arr[i][j] == 0)
        			continue;
        		
        		// sum hourglass form
        		temp = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j] + arr[i+1][j-1] + arr[i+1][j] +arr[i+1][j+1];
        		
        		// not hourglass form
        		if(temp < MIN_SUM_HOURGLASS)
        			continue;
        		
        		// find max sum
        		if(temp == MAX_SUM_HOURGLASS) {
        			max = MAX_SUM_HOURGLASS;
        			break;
        		}
        		
        		if(temp > max)
        			max = temp;
        	}
        }
        
        System.out.println(max);
    }

}
