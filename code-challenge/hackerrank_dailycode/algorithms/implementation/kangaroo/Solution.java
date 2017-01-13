import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		
		if (v1 == v2 && x1 != x2) {
			System.out.println("NO");
			return;
		}
		
		if (x1 == x2) {
			System.out.println("YES");
			return;
		}
		
		int gap = 0;
		int prevGap = Math.abs(x1 - x2);
		while(true) {
			
			x1 = x1 + v1;
			x2 = x2 + v2;
			gap = Math.abs(x1 - x2);
			
			if (gap == 0) {
				System.out.println("YES");
				return;
			}
			
			if (gap > prevGap) {
				System.out.println("NO");
				return;
			}
			
			prevGap = gap;
		}
	}
}



/* input 
0 2 5 3
*/

/* output
NO
*/
