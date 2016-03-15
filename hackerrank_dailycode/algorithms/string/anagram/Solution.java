import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cntTestCase = in.nextInt();
        
        for (int i = 0; i<cntTestCase; i++) {
        	String inStr = in.next();
        	int lenStr = inStr.length(); 
        	if(lenStr %2 != 0) {
        		System.out.println(-1);
        	} else {
        		
        		int[] arrA = new int[26];
        		int[] arrB = new int[26];
        		
        		for (int j = 0; j < lenStr/2; j++) {
        			arrA[inStr.charAt(j) - 'a'] = arrA[inStr.charAt(j) - 'a']+1;
        		}
        		
        		for (int j = lenStr/2; j < lenStr; j++) {
        			arrB[inStr.charAt(j) - 'a'] = arrB[inStr.charAt(j) - 'a']+1;
        		}
        		
        		int cntAnagram = 0;
        		for (int j = 0; j < 26; j++) {
        			if(arrA[j] == arrB[j]) {
        				cntAnagram += arrA[j];
        			} else if (arrA[j] != 0 && arrB[j] != 0) {
        				cntAnagram += Math.min(arrA[j], arrB[j]);
        			}
        		}
        		System.out.println((lenStr - cntAnagram*2)/2);
        	}
        }
    }
}
