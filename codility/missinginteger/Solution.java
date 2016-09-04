import java.util.HashSet;

class Solution {
	public int solution(int[] A) {
		int min = 1;
		HashSet<Integer> resultSet = new HashSet<>();
		for (int a : A) {
			if (a >= 0) {
				resultSet.add(a);
			}
		}
		
		while (resultSet.contains(min)) {
			min++;
		}
		
		return min;
	}
}