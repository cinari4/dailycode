import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cntTest = sc.nextInt();
        
        for(int i=0; i<cntTest; i++) {
        	System.out.println(findDigit(sc.next()));
        }
    }

	private static int findDigit(String strDigit) {
		int cnt = 0;
		int lenStrDigit = strDigit.length();
		
		for(int i=0; i<lenStrDigit; i++) {
			int tmp = Character.getNumericValue(strDigit.charAt(i));
			if(tmp != 0 && Long.valueOf(strDigit)%tmp == 0)
				cnt++;
		}
		return cnt;
	}
}
        