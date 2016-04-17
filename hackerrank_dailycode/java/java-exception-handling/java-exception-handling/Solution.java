import java.util.*;
import java.util.Scanner;

class myCalculator {
	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		return (int) Math.pow(n, p);
	}
}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}

/* input
 * 
3 5
2 4
-1 -2
-1 3

*/

/* output

243
16
java.lang.Exception: n and p should be non-negative
java.lang.Exception: n and p should be non-negative

*/