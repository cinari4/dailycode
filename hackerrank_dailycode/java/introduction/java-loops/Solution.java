import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int cntTestcase = sc.nextInt();
    	
    	for (int i = 0; i < cntTestcase; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int j = sc.nextInt();
    		int sum = 0 + a;
    		for (int k = 0; k < j; k++) {
    			sum += (int)(Math.pow(2, k)*b);
    			System.out.print(sum + " ");
    		}
    		System.out.println("");
    	}
    }
}
