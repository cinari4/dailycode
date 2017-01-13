import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntAnagram = 0;
        int totalCnt = 0;
        
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>(); 
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>(); 
        
        setHashMap(sc.nextLine(), map1);
        setHashMap(sc.nextLine(), map2);
        
        for(int i=97; i<=122; i++) {
        	totalCnt = totalCnt + map1.get(i) + map2.get(i);
        	if(map1.get(i) != 0 && map2.get(i) != 0)
        		cntAnagram = cntAnagram + (Math.min(map1.get(i), map2.get(i)) * 2);
        }
        
        System.out.println(totalCnt-cntAnagram);
    }
    
    public static void setHashMap(String inStr, Map<Integer, Integer> charLists) {
    	
    	for(int i=97; i<=122; i++)
    		charLists.put(i, 0);
    	
    	for(int i=0; i<inStr.length(); i++) {
        	Integer tmpCh = (int)inStr.toLowerCase().charAt(i);
        	charLists.put(tmpCh, charLists.get(tmpCh)+1);
    	}
    }
    
	
}