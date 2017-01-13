import java.math.BigDecimal;
import java.util.*;

class BigDecimalComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		BigDecimal d1 = new BigDecimal(o1);
		BigDecimal d2 = new BigDecimal(o2);
	
		int decimalCmp= d1.compareTo(d2);
		if(decimalCmp < 0) {
			return 1;
		} else if(decimalCmp > 0) {
			return -1;
		} else {
			int strCmp = o1.compareTo(o2);
			
			if(strCmp == 0)
				return 0;
			
			// 0 vs 000.000
			if(o1.indexOf('.') != -1) {
				return 1;
			} else if(o1.indexOf('.') != -1) {
				return 1;
			}
			
			if(strCmp < 0) {
				return 1;
			} else if(strCmp > 0) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}

class Solution{

	public static void main(String []argh)
	{
		//Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i]=sc.next();
		}
		
		BigDecimalComp comp = new BigDecimalComp();
		Arrays.sort(s, comp);
		
		//Output
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}

	}
}



/* input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

*/

/* output

90
56.6
50
02.34
0.12
.12
0
000.000
-100

*/
