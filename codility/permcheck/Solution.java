import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
	public int solution(int[] A) {
		SortedSet<Integer> resultSet = new TreeSet<>();
				
		for (int i = 0; i < A.length; i++) {
			if (A[i] >=1 && A[i] <= 100000000) {
				resultSet.add(A[i]);
			} else {
				return 0;
			}

		}
		
		if (A.length != resultSet.size() || A.length == 0) {
			return 0;
		} else {
			
			Iterator<Integer> it = resultSet.iterator();
			int tempData = it.next();
			while (it.hasNext()) {
				int nextData = it.next();
				if (tempData + 1 == nextData) {
					tempData = nextData;
					continue;
				} else {
					return 0;
				}
			}
			return 1;
		}
	}
}