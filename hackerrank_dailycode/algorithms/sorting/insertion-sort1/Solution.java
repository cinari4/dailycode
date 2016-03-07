import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertIntoSorted(int[] ar) {
    	int aux = ar[ar.length-1];
    	for(int i=ar.length-2; i>=0; i--) {
    		if(ar[i] > aux) {
    			ar[i+1] = ar[i];
    			printArray(ar);
    			
    		} else {
    			ar[i+1] = aux;
    			printArray(ar);
    			break;
    		}
    		
    	}

		if(ar[0] > aux) {
			ar[1] = ar[0];
			ar[0] = aux;
			printArray(ar);
		}
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}