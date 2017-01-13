import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letters = sc.next();
		sc.close();
		
		while (true) {
			String reduceStr = reduceString(letters);
			
			if (reduceStr.length() == 0) {
				System.out.println("Empty String");
				break;
			}
			
			if (reduceStr.length() == letters.length()) {
				System.out.println(reduceStr);
				break;
			} else {
				letters = reduceStr;
			}
		}
	}
	
	public static String reduceString(String letters) {
		char[] tmpArr = letters.toCharArray();
		char beforeChar = '0';
		int beforeCnt = 0;
		StringBuilder resultStr = new StringBuilder();
		
		for (int i = 0; i < tmpArr.length; i++) {
			if (beforeChar == tmpArr[i]) {
				beforeCnt++;
			} else {
				if (beforeCnt / 2 >= 1) {
					if (beforeCnt % 2 == 0) {
						resultStr.deleteCharAt(resultStr.length()-1);
					}
				}
					
				resultStr.append(tmpArr[i]);
				beforeChar = tmpArr[i];
				beforeCnt = 1;
			}
		}
		
		if (beforeCnt % 2 == 0) {
			resultStr.deleteCharAt(resultStr.length()-1);
		}
		return resultStr.toString();
	}
}