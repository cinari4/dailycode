import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        
        for(int i=0; i<cntTestCase; i++) {
        	System.out.println(getChocolateCount(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        
    }

	private static int getChocolateCount(int money, int costChocolate, int wrapper) {
	
		int cntChocolate=money/costChocolate;
		int remainChocolate = cntChocolate;
		
		while (remainChocolate >= wrapper) {
			remainChocolate -= wrapper;
			remainChocolate++;
			cntChocolate++;
		}
		
		return cntChocolate;
	}
}