import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntArr = sc.nextInt();
		int cntRotation = sc.nextInt();
		int cntQuery = sc.nextInt();
		
		int[] arr = new int[cntArr];
		for (int i = 0; i < cntArr; i++) {
			arr[i] = sc.nextInt();
		}
		
		cntRotation = cntRotation % cntArr;
		for (int i = 0; i < cntQuery; i++) {
			int index = sc.nextInt();
			if (index - cntRotation >= 0) {
				index = index - cntRotation;
			} else {
				index = index - cntRotation + arr.length;
			}
			System.out.println(arr[index]);
		}
		
		
	}
}

/* input
3 2 3
1 2 3
0
1
2
*/

/* output
2
3
1
*/
