import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int cntTestCase = in.nextInt();
    	for (int i = 0; i < cntTestCase; i++) {
    		String a = in.next();
    		String b = in.next();
    		boolean isSubstring = false;
    		
    		HashSet<Character> setA = new HashSet<>();
    		HashSet<Character> setB = new HashSet<>();
    		
    		for (int j = 0; j<a.length(); j++) {
    			setA.add(a.charAt(j));
    		}
    		
    		for (int j = 0; j<b.length(); j++) {
    			setB.add(b.charAt(j));
    		}
    		
    		Iterator iterator = setA.iterator();
    		while (iterator.hasNext()) {
    			if (setB.contains(iterator.next())) {
    				isSubstring = true;
    				break;
    			}
    		}
    		
    		if (isSubstring) {
    			sb.append("YES\n");
    		} else {
    			sb.append("NO\n");
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}