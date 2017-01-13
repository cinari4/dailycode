import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
	
	public static void main(String[] args) {
		int[] A = new int[7];
		A[0] = 9;
		A[1] = 1;
		A[2] = 9;
		A[3] = 3;
		A[4] = 9;
		A[5] = 7;
		A[6] = 9;
			
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int num : A) {
			if (result.containsKey(num)) {
				result.put(num, result.get(num) + 1);
			} else {
				result.put(num, 1);
			}
		}
		
		for (Entry<Integer, Integer> entry : result.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				return entry.getKey();
			}
		}
		
		return -1;
		
	}
}
