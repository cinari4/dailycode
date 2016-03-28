import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int i = 0;
    	while (sc.hasNext()) {
    		System.out.printf("%d %s\n",++i, sc.nextLine());
    	}
    }
}