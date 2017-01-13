import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> resultSet = new HashSet<String>();
		
		int cntTestcase = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < cntTestcase; i++) {
			resultSet.add(sc.nextLine());
			System.out.println(resultSet.size());
		}
		
	}
}

/* input

5
john tom
john mary
john tom
mary anna
mary anna

*/

/* output

1
2
2
3
3

*/