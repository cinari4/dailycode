import java.util.BitSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntBit = sc.nextInt();
		int cntTestcase = sc.nextInt();
		
		BitSet b1 = new BitSet(cntBit);
		BitSet b2 = new BitSet(cntBit);
		
		for (int i = 0; i < cntTestcase; i++) {
			String cmd = sc.next().toUpperCase();
			int op1 = sc.nextInt();
			int op2 = sc.nextInt();
			boolean isFirstOp = op1 == 1 ? true : false;
			
			switch (cmd) {
			case "AND":
				if (isFirstOp) {
					b1.and(b2);
				} else {
					b2.and(b1);
				}
				break;
				
			case "OR":
				if (isFirstOp) {
					b1.or(b2);
				} else {
					b2.or(b1);
				}
				break;
				
			case "XOR":
				if (isFirstOp) {
					b1.xor(b2);
				} else {
					b2.xor(b1);
				}
				break;
				
			case "FLIP":
				if (isFirstOp) {
					b1.flip(op2);
				} else {
					b2.flip(op2);
				}
				break;

			case "SET":
				if (isFirstOp) {
					b1.set(op2);
				} else {
					b2.set(op2);
				}
				break;
				
			default:
				break;
			}
			
			System.out.println(String.format("%s %s", b1.cardinality(), b2.cardinality()));
		}
		sc.close();
	}
}

/* input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

*/

/*output

0 0
1 0
1 1
1 2

*/