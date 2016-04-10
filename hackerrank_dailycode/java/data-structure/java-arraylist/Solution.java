import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntArrayList = sc.nextInt();
		List<List<Integer>> listArr = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < cntArrayList; i++) {
			List<Integer> tmpList = new ArrayList<Integer>();
			int cntElements = sc.nextInt();
			
			for (int j = 0; j < cntElements; j++) {
				tmpList.add(sc.nextInt());
			}
			
			listArr.add(tmpList);
		}
		
		int cntQuery = sc.nextInt();
		for (int i = 0; i < cntQuery; i++) {
			int row =  sc.nextInt();
			int column = sc.nextInt(); 
			
			if (row <= listArr.size()) {
				if (column <= listArr.get(row-1).size()) {
					System.out.println(listArr.get(row-1).get(column-1));
				} else {
					System.out.println("ERROR!");
				}
			} else {
				System.out.println("ERROR!");
			}
			
		}
		
	}
}

/* input 

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

*/

/* output 

74
52
37
ERROR!
ERROR!

*/