import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class TwoPair {
	int smaller;
	int bigger;
	TwoPair(int a, int b) {
		this.smaller = a;
		this.bigger = b;
	}
}

public class Solution {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System. in);
        int cnt = sc .nextInt() ;
        int arr[] = new int[ cnt];
        int min = Integer.MAX_VALUE;

        List<TwoPair> result = new ArrayList<TwoPair>();

        for(int i =0; i<cnt ; i++ ) {
          arr [i] = sc .nextInt() ;
        }
        
        for(int i =0; i<cnt ; i++ ) {
          for(int j =0; j<cnt ; j++ ) {
             if(i ==j) continue;
             int temp = Math .abs(arr[i]-arr[j]) ;
             if(temp < min) {
            	 min = temp;
            	 result.clear();
            	 addList(result, arr[i], arr[j]);
             } else if( temp == min ) {
            	 addList(result, arr[i], arr[j]);
             }
          }
        }
        
        Collections.sort(result, new Comparator<TwoPair>() {
			@Override
			public int compare(TwoPair o1, TwoPair o2) {
				return o1.smaller - o2.smaller;
			}
		});
        
        for(TwoPair pair : result) {
        	System.out.print(pair.smaller + " " + pair.bigger + " ");
        }
    }
    
    public static void addList(List<TwoPair> result, int a, int b) {
    	int small;
    	int big;
    	
    	 if(a<b) {
    		 small = a;
    		 big = b;
    	 } else {
    		 small = b;
    		 big = a;
    	 } 
    	 
    	 for(TwoPair pair : result) {
    		 if(small == pair.smaller)
    			 return ;
    	 }
    	
    	 result.add(new TwoPair(small, big));
    }

}