import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numArr = sc.nextInt();
		int numRotate = sc.nextInt();
		int[] arr = new int[numArr];
		
		for (int i = 0; i<numArr; i++) arr[i] = sc.nextInt();
		
		int startPos = numRotate % numArr;
		for (int i = 0; i<numArr; i++) {
			if (startPos >= numArr)
				startPos = 0;
			System.out.print(arr[startPos++] + " ");
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