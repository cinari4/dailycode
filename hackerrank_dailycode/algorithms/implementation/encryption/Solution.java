import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String plainText = in.next();
		int lenPlainText = plainText.length();
		
		int row, coloum;
		row = (int) Math.floor(Math.sqrt(lenPlainText));
		coloum = (int) Math.ceil(Math.sqrt(lenPlainText));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < coloum; i++) {
			int j = i;
			while (j < lenPlainText) {
				sb.append(plainText.charAt(j));
				j+=coloum;
			}
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		
	}
}

/* input

haveaniceday

*/

/* output

hae and via ecy

*/
