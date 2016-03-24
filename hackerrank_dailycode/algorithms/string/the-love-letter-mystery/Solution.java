import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cntTestCase = in.nextInt();
        
        for (int i = 0; i<cntTestCase; i++) {
        	int ans = 0;
        	String inStr = in.next();
        	char[] arrStr = new char[inStr.length()];
        	arrStr = inStr.toCharArray();
        	
        	for (int j = 0,k = arrStr.length-1; j < k; j++, k--) {
        		if(arrStr[j] != arrStr[k]) {
        			ans = ans + Math.abs(arrStr[j] - arrStr[k]);
        		}
        	}
        	System.out.println(ans);
        }
    }
}
