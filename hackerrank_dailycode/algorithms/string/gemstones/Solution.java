import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        int [] arrayChars = new int[26];
        Set<Character> charSet = new HashSet<Character>();
        int cnt = 0;
    
        for(int i=0; i<cntTestCase; i++) {
        	String inStr = sc.next();
        	
        	for(char c:inStr.toCharArray()) {
        		charSet.add(c);
        	}
        	
            for(char c:charSet) {
                int x = (int)c-97;
                arrayChars[x]++;

                if(arrayChars[x] >= cntTestCase)
                	cnt++;
            }
            charSet.clear();  
        }
        System.out.println(cnt);
    }
    
	
}