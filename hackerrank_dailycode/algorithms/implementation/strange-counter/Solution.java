import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long time = in.nextLong();
		in.close();
		
		long val = 3;
		while (true) {
			if (val >= time) {
				System.out.println(val - time + 1);
				break;
			} else {
				time = time - val;
				val *= 2;
			}
		}
		
	}
}
