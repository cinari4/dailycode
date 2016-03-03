import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();
        
        HashMap<Character, Integer> characterHashMap = new HashMap<Character, Integer>();
        for(int i=0; i<inStr.length(); i++) {
        	Character tmpCh = inStr.charAt(i);
        	if(characterHashMap.containsKey(tmpCh)) {
        		characterHashMap.put(tmpCh, characterHashMap.get(tmpCh)+1);
        	} else {
        		characterHashMap.put(tmpCh, 1);
        	}
        }
        
        boolean isOdd = false;
        for( Character key : characterHashMap.keySet()) {
        	if(characterHashMap.get(key) % 2 == 1) {
        		if(isOdd) {
        			System.out.println("NO");
        			return;
        		}
        		isOdd = true;
        	}
        }
        
        System.out.println("YES");
    }
	
}