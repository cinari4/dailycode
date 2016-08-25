import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Solution {
    public int solution(int num) {
		int max = 0;
		
		int before = 0;
		int tmpCnt = 0;
		
		String strBinary = Integer.toBinaryString(num);
		for (int i = 0; i < strBinary.length(); i++) {
			if (strBinary.charAt(i) != '0') {
				max = Math.max(max, tmpCnt);
				tmpCnt = 0;
			} else {
				tmpCnt++;
			}
		}
		
		return max;
    }
}