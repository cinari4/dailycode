import java.io.*;
import java.util.*;

public class Solution {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        for(int i=0; i<cntTestCase; i++) {
        	if(isFunnyString(sc.next()))
        		System.out.println("Funny");
        	else
        		System.out.println("Not Funny");
        }
    }
        
	private static boolean isFunnyString(String strOrig) {
		StringBuilder sb = new StringBuilder();
		sb.append(strOrig);
		String strRev = sb.reverse().toString();
		
		for(int i=0; i<strOrig.length()/2+1; i++) {
			int tmp1 = Math.abs(strOrig.charAt(i+1) - strOrig.charAt(i));
			int tmp2 = Math.abs(strRev.charAt(i+1) - strRev.charAt(i));
			if(tmp1 != tmp2)
				return false;
		}
		return true;
	}
	
		
}