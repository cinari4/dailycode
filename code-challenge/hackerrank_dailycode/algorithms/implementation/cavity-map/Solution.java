import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cntTestCase = in.nextInt();
        char[][] arr = new char[cntTestCase][cntTestCase];
        for(int i=0; i<cntTestCase; i++) {
        	arr[i] = in.next().toCharArray();
        }
        
        for(int i=1; i<cntTestCase-1; i++) {
        	for(int j=1; j<cntTestCase-1; j++) {
        		if(arr[i][j] > arr[i-1][j] 
        				&& arr[i][j] >arr[i+1][j]
        				&& arr[i][j] >arr[i][j-1]
        				&& arr[i][j] >arr[i][j+1]) {
        			arr[i][j] = 'X';
        		}
        	}
        }
        
        for(int i=0; i<cntTestCase; i++) {
        	System.out.println(arr[i]);
        }
    }
}