import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		StringBuilder sb = new StringBuilder();
		
		while(testCases>0){
			removeTag(in.nextLine(), sb);
			testCases--;
		}
		
		System.out.println(sb.toString());
	}
	
	public static void removeTag(String inStr, StringBuilder sb) {
		// String pattern =  "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
		String pattern = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(inStr);
		
		int cnt = 0;
		while (m.find()) {
			sb.append(m.group(2)).append("\n");
			cnt++;
		}
		
		if (cnt == 0)
			sb.append("None\n");
	}
}

/*

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

*/

/* output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush

*/