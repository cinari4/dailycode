import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int pos = 0;
		int energy = 100;
		do {
			pos += k;
			pos = pos % n;
			
			if (arr[pos] == 1) {
				energy-=3;
			} else {
				energy--;
			}
			
		} while(pos % n != 0);
		
		System.out.println(energy);
	}
}

/* input

8 2
0 0 1 0 0 1 1 0

*/

/*

92

 */

