import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<cntTestCase; i++) {
        	int numStone = sc.nextInt();
        	
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	sb.append(findTheStone(a, b, numStone-1) + "\n");
        }
        System.out.println(sb.toString());
    }

	private static String findTheStone(int a, int b, int numStone) {
        Set<Integer> result = new HashSet<>();
        
        for (int i=0; i<numStone; i++) {
        	result.add( i * a + (numStone-i) * b);
        	result.add( i * b + (numStone-i) * a);
        }
        
    	TreeSet<Integer> sortedResult = new TreeSet<>();
    	sortedResult.addAll(result);
    	
    	Iterator iter = sortedResult.iterator();
    	StringBuilder sb = new StringBuilder();
    	while(iter.hasNext()) {
    		sb.append(iter.next() +" ");
    	}
    	return sb.toString();
	}
	
}