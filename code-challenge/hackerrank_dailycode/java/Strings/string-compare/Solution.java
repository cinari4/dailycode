import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String inStr = sc.nextLine();
    	int cntSubstring = sc.nextInt();
    	
    	// init
    	String maxString = inStr.substring(0, cntSubstring);
    	String minString = inStr.substring(0, cntSubstring);
    	
    	for (int i = 1; i < inStr.length()-cntSubstring+1; i++) {
    		String tmp = inStr.substring(i, i+cntSubstring);
    		if (tmp.compareTo(minString) < 0) {
    			minString = tmp;
    			continue;
    		}
    		
    		if (tmp.compareTo(maxString) > 0) {
    			maxString = tmp;
    			continue;
    		}
    	}
    	
    	System.out.println(minString);
    	System.out.println(maxString);
    }
}