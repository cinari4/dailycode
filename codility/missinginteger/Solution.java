import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
	public int solution(int[] A) {
		int result = 0;
		SortedSet<Integer> resultSet = new TreeSet<Integer>();
		for (int a : A) {
			if (a > 0) {
				resultSet.add(a);
			}
		}
		
		Iterator<Integer> it = resultSet.iterator();
		int min = 0;
		int missingInt = 0;
		if (it.hasNext()) {
			min = it.next();
			missingInt = min;
		}
		
		while (it.hasNext()) {
			int num = it.next();
			if (min + 1 != num) {
				result = min + 1;
				break;
			} else {
				min = num;
			}
		}
		
		if (result <= 0) {
			result = missingInt;
		}
		return result;
	}
}