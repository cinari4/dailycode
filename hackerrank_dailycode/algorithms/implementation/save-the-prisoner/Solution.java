import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int cntTestCase = in.nextInt();
		
		for (int i = 0; i < cntTestCase; i++) {
			int numPrisoners  = in.nextInt();
			int numSweets = in.nextInt();
			int startPrisonerId = in.nextInt(); 
			
			int lastPrisonId = (startPrisonerId + numSweets - 1) % numPrisoners;
			if (lastPrisonId == 0) {
				System.out.println(numPrisoners);
			} else {
				System.out.println(lastPrisonId);
			}
		}
	}
}