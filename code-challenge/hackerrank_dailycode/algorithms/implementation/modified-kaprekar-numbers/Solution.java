import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	long minValue = in.nextLong();
    	long maxValue = in.nextLong();
    	int cnt = 0;
    	
    	
    	for (long i = minValue; i <= maxValue; i++) {
    		long square = i*i;
    		String strSquare = String.valueOf(square);
    	
    		if (square <= 9) {
    			strSquare = "0"+strSquare;
    		}
    		
    		int lenKaprekar = strSquare.length();
    		long left = Long.parseLong(strSquare.substring(0, lenKaprekar/2));
    		long right = Long.parseLong(strSquare.substring(lenKaprekar/2));
    		
    		if (i == left + right) {
    			cnt++;
    			sb.append(i + " ");
    			continue;
    		}
    	}
    	
    	if (cnt == 0) {
    		System.out.println("INVALID RANGE");
    	}
    	System.out.println(sb.toString());
    	
    }
}