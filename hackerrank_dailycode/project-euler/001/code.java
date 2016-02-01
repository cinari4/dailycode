import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
    	for(int i=0; i<T; i++) {
    		int temp = sc.nextInt();
    		int sum = 0;
    		
    		for(int j=3; j<temp; j+=3) {
    			sum +=j;
    		}
    		
    		for(int j=5; j<temp; j+=5) {
    			sum +=j;
    		}
    		
    		for(int j=15; j<temp; j+=15) {
    			sum -=j;
    		}
    		
    		sb.append(sum+"\n");
    	}
    	
    	System.out.println(sb.toString());
    }
}