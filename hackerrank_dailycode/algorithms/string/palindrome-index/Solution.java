import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cntTestCase = in.nextInt();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i<cntTestCase; i++) {
        	String inStr = in.next();
        	StringBuilder sb = new StringBuilder(inStr);
        	if (inStr.equals(sb.reverse().toString())) {
        		System.out.println(-1);
        		continue;
        	}
        	
        	for (int j = 0; j < inStr.length(); j++) {
				if (isPalindrome(j, inStr)) {
					System.out.println(j);
					break;
				}
        	}
        }
        
    }
    
    public static boolean isPalindrome(int deleteChar, String inStr) {
    	StringBuilder sb = new StringBuilder(inStr);
    	sb.deleteCharAt(deleteChar);
    	
    	String origStr = sb.toString();
    	sb.reverse();
    	
    	return origStr.equals(sb.toString());
    }
}
