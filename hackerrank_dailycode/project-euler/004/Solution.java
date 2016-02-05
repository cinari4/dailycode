import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int max = sc.nextInt();
    	
    	List<Integer>palindromicList = getMaxPalindromicList();
    	
    	
    	while(max-->0) {
    		System.out.println(getMaxPalindromic(sc.nextInt(), palindromicList));
    	}
    	
    }
    

	private static int getMaxPalindromic(int num, List<Integer> palindromicList) {
		Iterator iter = palindromicList.iterator();
		int before = 0;
		
		if(palindromicList.contains(num))
			return num;
		
		while(iter.hasNext()) {
			int temp = (int)iter.next(); 
			if(num<temp) {
				return before;
			} else {
				before = temp;
			}
		}
		
		return 0;
	}


	private static List<Integer> getMaxPalindromicList() {
    	List<Integer> palindromicList = new ArrayList<Integer>();  
    	for(int i=100; i<1000; i++) {
    		for(int j=100; j<1000; j++) {
    			int temp = i*j;
				if(isPalindrome(temp)) {
					palindromicList.add(temp);
				}
    		}
    	}
    	Collections.sort(palindromicList);
    	return palindromicList;
    }
    
    public static boolean isPalindrome(int product) {
        boolean isPalindrome=false;
        if(product/100000==0)
        	return false;
       
        String strProduct = String.valueOf(product);
        
        StringBuilder temp = new StringBuilder(strProduct).reverse();
        if(temp.toString().equals(strProduct))
        {
            isPalindrome=true;
        }
        return isPalindrome;
    }
    
}