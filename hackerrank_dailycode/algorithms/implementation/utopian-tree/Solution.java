import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cntTest = sc.nextInt();
        
        for(int i=0; i<cntTest; i++) {
        	System.out.println(getUtopiaTreeLength(sc.nextLong()));
        }
    }

    public static long getUtopiaTreeLength(long cycle) {
        long height = 1;

        if(cycle==0)
            return 1;

        for(int i=1; i<=cycle; i++) {
            if(i%2==1)
                height = height*2;
            else
                height = height +1;
        }
        return height;
    } 
    
}