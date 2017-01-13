import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numChapters = in.nextInt();
        int numProblems = in.nextInt();
        
        int[] arrProblesPerPage = new int[numChapters];
        for (int i = 0; i < numChapters; i++) {
        	arrProblesPerPage[i] = in.nextInt();
        }
        
        int page = 0;
        int cntSpecialNumber = 0;
        
        for (int i = 0; i < numChapters; i++) {
        	page++;
        	for (int j = 1; j <= arrProblesPerPage[i]; j++) {
        		// System.out.println("page : " + page);
        		// System.out.println(j);
        		if ( page == j) {
        			cntSpecialNumber++;
        		}
        		if ( j%numProblems == 0) {
        			if (j != arrProblesPerPage[i])
        				page++;
        		}
        	}
        }
        
        System.out.println(cntSpecialNumber);
    }
}
