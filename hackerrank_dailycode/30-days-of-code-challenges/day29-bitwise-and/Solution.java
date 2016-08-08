import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cntTest = sc.nextInt();
		for (int i = 0; i < cntTest; i++) {
			System.out.println(getMaximumValue(sc.nextInt(), sc.nextInt()));
		}
		sc.close();
	}
	
	public static int getMaximumValue(int n, int k) {
		int max = Integer.MIN_VALUE;
		int[] arr = new int[n];
		for (int i = 1; i <= n-1; i++) {
			for (int j = i + 1; j <= n; j++) {
				arr[i&j]++;
			}
		}
		
		for (int i = k-1; i >= 0; i--) {
			if (arr[i] != 0) {
				return i;
			}
		}
		return 0;
	}
}
