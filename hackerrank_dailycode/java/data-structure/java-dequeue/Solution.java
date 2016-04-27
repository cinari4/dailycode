import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int maxCnt = Integer.MIN_VALUE;
		
		int[] arrInput = new int[n];
		
		// add all numbers
		for (int i = 0; i < n; i++) {
			arrInput[i] = in.nextInt();
		}
		
		Deque<Integer> tmpQueue = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			tmpQueue.push(arrInput[i]);
		}
		
		for (int i = 0; i < n-m; i++) {
			maxCnt = Math.max(getUniqueCnt(tmpQueue), maxCnt);
			if(maxCnt == m) {
				System.out.println(maxCnt);
				return;
			}
			tmpQueue.removeLast();
			tmpQueue.push(arrInput[i+m]);
		}
		
		maxCnt = Math.max(getUniqueCnt(tmpQueue), maxCnt);
		
		System.out.println(maxCnt);
	}

	private static int getUniqueCnt(Deque<Integer> deque) {
		Set<Integer> tmpSet = new HashSet<>();
		for (Iterator<Integer> iter = deque.iterator(); iter.hasNext(); ) {
			tmpSet.add(iter.next());
		}
		return tmpSet.size();
	}
}
/* input

6 3
5 3 5 2 3 2

*/

/* output

3

*/