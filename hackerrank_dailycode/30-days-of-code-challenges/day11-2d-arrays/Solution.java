
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        in.close();
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 4; j++) {
        		max = Math.max(max, sumHourglasses(arr, i, j));
        	}
        }
        
        System.out.println(max);
        
    }
    
    public static int sumHourglasses(int arr[][], int i, int j) {
    	return arr[i][j]  + arr[i][j+1]  + arr[i][j+2]
    		 + arr[i+1][j+1]
    		 + arr[i+2][j]  + arr[i+2][j+1] + arr[i+2][j+2];
    }
}


