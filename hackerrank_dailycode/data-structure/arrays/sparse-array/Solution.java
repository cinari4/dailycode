import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> dataMap = new HashMap<String, Integer>();
		
		int cntData = sc.nextInt();
		for(int i = 0; i < cntData; i++) {
			String tmpStr = sc.next();
			if(dataMap.containsKey(tmpStr)) {
				dataMap.put(tmpStr, dataMap.get(tmpStr) + 1);
			} else {
				dataMap.put(tmpStr, 1);
			}
		}
		
		int cntQuery = sc.nextInt();
		for(int i = 0; i < cntQuery; i++) {
			String tmpStr = sc.next();
			if(dataMap.containsKey(tmpStr))
				System.out.println(dataMap.get(tmpStr));
			else
				System.out.println(0);
		}
	}
}

/* input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

*/

/* output

2
1
0

*/