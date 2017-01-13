import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		
		System.out.println(String.format("Array is sorted in %d swaps.", bubbleSort(a)));
		System.out.println(String.format("First Element: %d", a[0]));
		System.out.println(String.format("Last Element: %d", a[a.length-1]));
		
	}
	
	public static int bubbleSort(int a[]) {
		int numberOfSwaps = 0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					numberOfSwaps++;
				}
			}
			
			if (numberOfSwaps == 0) {
				break;
			}
		}
		return numberOfSwaps;
	}
}

/* input
3
3 2 1
*/

/* output
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3
*/