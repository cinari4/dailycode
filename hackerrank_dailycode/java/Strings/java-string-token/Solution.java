import java.io.*;
import java.util.*;

public class Solution {
      
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer tokenizer = new StringTokenizer(s, " !,?._'@");
		int cnt = 0;
		
		while(tokenizer.hasMoreTokens()) {
			cnt++;
			sb.append(tokenizer.nextToken() + "\n");
		}
		
		System.out.println(cnt);
		System.out.println(sb.toString());
    }
}
