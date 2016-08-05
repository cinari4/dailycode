
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fine = 0;
		
		int actualDay = sc.nextInt();
		int actualMonth = sc.nextInt();
		int actualYear = sc.nextInt();
		
		int expectDay = sc.nextInt();
		int expectMonth = sc.nextInt();
		int expectYear = sc.nextInt();
		
		sc.close();
		
		boolean isSameYear = (actualYear == expectYear) ? true : false;
		
		if (actualYear > expectYear) {
			fine += 10000;
		} else if (actualMonth > expectMonth && isSameYear ) {
			fine += getFine(actualMonth, expectMonth, 500);
		} else if (actualDay > expectDay && isSameYear) {
			fine += getFine(actualDay, expectDay, 15);
		} 
		
		System.out.println(fine);
	}
	
	public static int getFine(int actual, int expect, int perDayFine)  {
		return (actual - expect) * perDayFine;
	}
}