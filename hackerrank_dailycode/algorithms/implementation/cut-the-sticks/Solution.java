import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        int[] arrSticks = new int[cntTestCase];
        
        for(int i=0; i<cntTestCase; i++) {
        	arrSticks[i] = sc.nextInt();
        }
        
    	while(true) {
    		int minStick = Integer.MAX_VALUE;
    		int cntZero = 0;
    		int cntSub = 0;
    		
    		for(int i=0; i<cntTestCase; i++) {
    			if(arrSticks[i] == 0) {
    				cntZero++;
    				continue;
    			}
    			
    			minStick = Math.min(arrSticks[i], minStick);
    		}
    		
    		if(cntZero==cntTestCase) {
    			break;
    		}
    		
    		for(int i=0; i<cntTestCase; i++) {
    			if(arrSticks[i]!=0) {
    				arrSticks[i] = arrSticks[i]-minStick;
    				cntSub++;
    			}
    		}
    		
    		System.out.println(cntSub);
    		
    	}
    }
}