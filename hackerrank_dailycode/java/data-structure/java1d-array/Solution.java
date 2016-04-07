import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestcase = sc.nextInt();
        int[] arrList = new int[cntTestcase];
        int cntResult = 0;
        
        for (int i = 0; i < cntTestcase; i++) {
        	arrList[i] = sc.nextInt();
        }
        
        for (int i = 0; i < cntTestcase; i++) {
        	for (int j = i; j < cntTestcase; j++) {
        		int sum = 0;
        		for (int k = i; k <= j; k++) {
        			sum += arrList[k];
        		}
        		if (sum < 0)
        			cntResult++;
        	}
        }
        
        System.out.println(cntResult);
    }
}