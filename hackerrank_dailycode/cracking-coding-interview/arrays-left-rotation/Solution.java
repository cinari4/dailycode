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
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		
		for (int i = k; i < k + a.length; i++) {
			System.out.print(a[i % a.length] + " ");
		}
	}
}

/* input
5 4
1 2 3 4 5
*/

/* output
5 1 2 3 4
*/
