import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int lenHighway = sc.nextInt();
        int cntTestcase = sc.nextInt();
        int[] arrVehicleType = new int[lenHighway];
        
        for(int i=0; i<lenHighway; i++) {
        	arrVehicleType[i] = sc.nextInt();
        }
        
        for(int i=0; i<cntTestcase; i++) {
        	System.out.println(getLargestVehicleAllowedSegments(arrVehicleType, sc.nextInt(), sc.nextInt()));
        }
        
    }
    
    public static int getLargestVehicleAllowedSegments(int[] arr, int start, int end) {
    	int min = 3;
    	for(int i=start; i<=end; i++) {
    		min = Math.min(min, arr[i]);
    	}
    	return min;
    }

}