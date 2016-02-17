import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int numTestCase = sc.nextInt();
    	
    	for(int i=0; i<numTestCase; i++) {
    		int numStudents = sc.nextInt();
    		int threshold = sc.nextInt();
    		int numAttendance = 0; 
    		
    		for(int j=0; j<numStudents; j++) {
    			if(sc.nextInt() <= 0)
    				numAttendance++;
    		}
    		
    		if(numAttendance>=threshold)
    			System.out.println("NO");
    		else
    			System.out.println("YES");
    			
    	}
    	
    }
}