import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        
        for(int i=0; i<cntTestCase; i++) {
        	String inStr= sc.next();
        	char chBefore = 0;
        	int cntDeletions = 0;
        	for(int j=0; j<inStr.length(); j++) {
        		if(chBefore == inStr.charAt(j)) {
        			cntDeletions++;
        		} else {
        			chBefore = inStr.charAt(j);
        		}
        	}
        	System.out.println(cntDeletions);
        }
        
    }
    
	
}