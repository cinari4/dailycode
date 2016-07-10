import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.xml.soap.Node;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cntTestCase = in.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < cntTestCase; i++) {
			arr.add(in.nextInt());
		}
		
		int cntCmd = in.nextInt();
		for (int i = 0; i < cntCmd; i++) {
			String cmd = in.next();
			if (cmd.equals("Insert")) {
				int pos = in.nextInt();
				int data = in.nextInt();
				arr.add(pos, data);
			} else if(cmd.equals("Delete")) {
				int pos = in.nextInt();
				arr.remove(pos);
			}
		}
		
		in.close();
		
		for (int data : arr) {
			System.out.print(data + " ");
		}

	}
}

/* input 
5
12 0 1 78 12
2
Insert
5 23
Delete
0
*/

/* output
0 1 78 12 23
*/