import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntSeq, cntQuery;
		int lastAns = 0;
		
		// N
		cntSeq = sc.nextInt();
		// Q
		cntQuery = sc.nextInt();
		
		List[] seqList = new List[cntSeq];
		for(int i = 0; i < cntSeq; i++) {
			seqList[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < cntQuery; i++) {
			int queryType = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(queryType == 1) {
				int tmpIndex = (x ^ lastAns) % cntSeq; 
				seqList[tmpIndex].add(y);
			} else if(queryType == 2) {
				int tmpIndex = (x ^ lastAns) % cntSeq;
				int tmpSubIndex = y % seqList[tmpIndex].size();
				lastAns = (int) seqList[tmpIndex].get(tmpSubIndex);
				System.out.println(lastAns);
			}
		}
		
	}
	
}
