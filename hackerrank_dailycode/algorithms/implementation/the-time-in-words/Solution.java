import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = in.nextInt();
		int m = in.nextInt();
		
		String[] strHour = {"one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
		String strMin[] = {"one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", 
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", 
				"sixteen", "seventeen", "eighteen", "ninteen", "twenty",
				"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", 
				"twenty six", "twenty seven", "twenty eight", "twenty nine"};

		if (m == 0) {
			System.out.println(strHour[h-1] + " o\' clock");
		} else if(m == 1) {
			System.out.println("one minute past " + strHour[h-1]);
		} else if(m == 10) {
			System.out.println("ten minutes past " + strHour[h-1]);
		} else if(m == 15) {
			System.out.println("quarter past " + strHour[h-1]);
		} else if(m == 30) {
			System.out.println("half past " + strHour[h-1]);
		} else if(m == 40) {
			System.out.println("twenty minutes to " + strHour[h]);
		} else if(m == 45) {
			System.out.println("quarter to " + strHour[h]);
		} else if(m < 30) {
			System.out.println(strMin[m - 1] + " minutes past " + strHour[h-1]);
		} else if(m > 30) {
			System.out.println(strMin[60 - m - 1] + " minutes to " + strHour[h]);
		}
	}
}
