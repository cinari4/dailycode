import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntQuery = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		
		for (int i = 0; i < cntQuery; i++) {
			int query = sc.nextInt();
			if (query == 1) {
				st.push(new Integer(sc.nextInt()));
			} else if (query == 2) {
				st.pop();
			} else if (query == 3) {
				int max = Integer.MIN_VALUE;
				for (int j = 0; j<st.size(); j++) {
					max = Math.max(max, (int)st.get(j));
				}
				System.out.println(max);
			}
			
		}
	}
}


/* input 
10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
*/

/* output
26
91
*/
