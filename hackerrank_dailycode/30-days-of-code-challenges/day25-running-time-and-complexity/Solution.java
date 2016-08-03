import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int tmp = sc.nextInt();
			int sq = (int)Math.sqrt(tmp);
			boolean isPrime = true;
			
            if (tmp < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= sq; j++) {
                    if (tmp % j == 0) {
                        isPrime = false;
                        break;
                    }
                } 
            }
            

			
			if (isPrime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
			
		}
	}
}
