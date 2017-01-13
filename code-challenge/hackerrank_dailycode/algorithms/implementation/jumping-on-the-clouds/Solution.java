import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for(int c_i=0; c_i < n; c_i++){
			c[c_i] = in.nextInt();
		}
		
		int cnt = -1;
		for (int i = 0; i < c.length; i++) {
			if (i+2 < c.length && c[i+2] == 0) {
				i++; cnt++;
			} else {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
