import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            long sum = 0;
            if (x > y) {
            	if ( (b*(y+z)) < b*x ) {
            		sum = (b*(y+z)) + w*y;
            	} else {
            		sum = b*x + w*y;
            	}
            } else {
            	if ( (w*(x+z)) < w*y) {
            		sum = b*x + (w*(x+z));
            	} else {
            		sum = b*x + w*y;
            	}
            }
            System.out.println(sum);
        }
    }
}
