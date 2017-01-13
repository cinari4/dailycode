import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cntArr = in.nextInt();
		int arr[] = new int[cntArr];
		Set<Integer> setArr = new HashSet<>();
		
		for (int i = 0; i < cntArr; i++) {
			arr[i] = in.nextInt();
			setArr.add(arr[i]);
		}
		
		int min = Integer.MAX_VALUE;
		
		for (Integer key : setArr) {
			int start = -1;
			for (int i = 0; i <cntArr; i++) {
				if (arr[i] == key && start != -1) {
					// System.out.println("key : " + key + " start : " + start + " i : " + i);
					min = Math.min(min, Math.abs(start - i));
					start = i;
					continue;
				} else if (arr[i] == key) {
					start = i;
				}
				
			}
		}
		if (min == Integer.MAX_VALUE)
			min = -1;
		System.out.println(min);
		
	}
}

/* input
6
7 1 3 4 1 7
*/

/* output
3
*/
