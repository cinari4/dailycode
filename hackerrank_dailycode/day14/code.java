import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	public Difference(int[] a) {
  		this.elements = a;
  		maximumDifference = 0;
	}
  	
  	public void computeDifference() {
  		for(int i=0; i<elements.length; i++) {
  			for(int j=i+1; j<elements.length; j++) {
  				int temp = Math.abs(elements[i] - elements[j]);
  				if(temp > maximumDifference)
  					maximumDifference = temp;
  			}
  		}
  	}
  	
  	
} // End of Difference Class

public class Solution {        
  	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] a = new int[N];
    
    	for (int i = 0; i < N; i++) {
    		a[i] = sc.nextInt();
    	}

      	Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
   }
}