import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		
		int maxUnique = 0;
		Set<Integer> uniqueSet = new HashSet<>();
		boolean isUniqueSetSmall = false;
		

		if (m == 1) {
			System.out.println(m);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
			deque.addLast(arr[i]);
			
			// check dequeue
			if (deque.size() == m) {
				// add all elements in Set
				Set<Integer> set = new HashSet<>();
				set.addAll(deque);
				
				// check 
				if (set.size() == m) {
					System.out.println(m);
					return;
				} else {
					maxUnique = Math.max(maxUnique, set.size());
				}
				deque.removeFirst();
			}
		}
		System.out.println(maxUnique);
	}
}
