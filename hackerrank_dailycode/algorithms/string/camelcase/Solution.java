import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		int cntCalmelcase = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				cntCalmelcase++;
			}
		}
		
		System.out.println(cntCalmelcase);
		
	}
}