import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean result = true;
        
        for (int i = 0, j = A.length()-1; i < A.length() / 2; i++, j--) {
        	if (Math.abs(A.charAt(i)) - Math.abs(A.charAt(j)) != 0) {
        		result = false;
        		break;
        	}
        }
        
        if (result) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
    }
}
