import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] arr = in.next().toCharArray();
		
		int cntResult = 0;
		for (int i = 0; i < arr.length-2; i++) {
			if (arr[i] == '0' && arr[i+1] == '1' && arr[i+2] == '0') {
				cntResult++;
				i+=2;
			}
		}
		System.out.println(cntResult);
	}
}
