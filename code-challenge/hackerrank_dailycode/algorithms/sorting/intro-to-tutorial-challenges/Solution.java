import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int theValue = sc.nextInt();
        int cntTestCase = sc.nextInt();
        int[] arrNum = new int[cntTestCase];
        int indexTheValue = 0;
        for (int i=0; i < cntTestCase; i++) {
        	if (sc.nextInt() == theValue)
        		indexTheValue = i;
        }
        
        System.out.println(indexTheValue);
        
    }
}