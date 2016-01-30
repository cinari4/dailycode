import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
    	StringBuilder sb = new StringBuilder();
       
        while(T-->0){
            String data=sc.next();
    		if(checkFunnyString(data))
    			sb.append("Funny\n");
    		else
    			sb.append("Not Funny\n");
        }
    	
    	System.out.println(sb.toString());
    }

	private static boolean checkFunnyString(String funnyStr) {
		char[] arrFunny = funnyStr.toCharArray();
		char[] reverseFunny = getReverseArr(funnyStr);
		for(int i=1; i<arrFunny.length; i++) {
			if((Math.abs(arrFunny[i]-arrFunny[i-1])) != (Math.abs(reverseFunny[i]-reverseFunny[i-1]))) {
				return false;
			}
		}
		return true;
	}
	
	private static char[] getReverseArr(final String origStr) {
		StringBuilder sb = new StringBuilder(origStr);
		return sb.reverse().toString().toCharArray();
	}
}