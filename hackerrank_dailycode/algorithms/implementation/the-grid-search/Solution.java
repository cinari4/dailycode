import java.io.*;
import java.util.*;

public class Solution {
	public static class Grid {
		public int x;
		public int y;
		public String[] arr;
		
		public Grid(int x, int y, String[] arr) {
			this.x = x;
			this.y = y;
			this.arr = arr;
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        
        for(int i=0; i<cntTestCase; i++) {
        	int y1 = sc.nextInt();
        	int x1 = sc.nextInt();
        	String[] arr1 = new String[y1];
        	for(int j=0; j<y1; j++) {
        		arr1[j] = sc.next();
        	}
        	
        	int y2 = sc.nextInt();
        	int x2 = sc.nextInt();
        	String[] arr2 = new String[y2];
        	for(int j=0; j<y2; j++) {
        		arr2[j] = sc.next();
        	}
        	
        	System.out.println(findGrid(x1, y1, arr1, x2, y2, arr2));
        }
        
    }
    
    public static String findGrid(int x1, int y1, String arr1[], int x2, int y2, String arr2[]) {
    	boolean find;
    	int posSubString;
    	
    	for(int i=0; i<y1-y2; i++) {
    		find = true;
    		posSubString = -1;
    		inner:
    		for(int j=0, k=i;j<y2; j++,k++) {
    			//System.out.println("arr1:"+arr1[k]+"\tarr2:"+arr2[j]);
    			if(!arr1[k].contains(arr2[j])) {
    				find = false;
    				break inner;
    			} else {
    				if(posSubString == -1) {
    					posSubString = arr1[k].indexOf(arr2[j]);
    				} else if(posSubString != arr1[k].indexOf(arr2[j])) {
    					find = false;
    					break inner;
    				}
    			}
    		}
    		
    		if(find==true)
    			return "YES";
    	}
    	
    	return "NO"; 
    }
	
}