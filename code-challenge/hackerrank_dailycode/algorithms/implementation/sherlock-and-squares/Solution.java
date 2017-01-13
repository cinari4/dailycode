import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cntTest = sc.nextInt();
        
        for(int i=0; i<cntTest; i++) {
        	System.out.println(findSquares(sc.nextDouble(), sc.nextDouble()));
        }
    }

	private static int findSquares(double a, double b) {
		return ( (int)(Math.floor(Math.sqrt(b))
                - Math.ceil(Math.sqrt(a)) + 1) );
	}
    
}