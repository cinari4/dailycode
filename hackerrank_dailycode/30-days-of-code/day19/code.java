import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		if(n == 1) return n;
	    int maxD = (int)Math.sqrt(n);
	    int sum=1;
	    for(int i = 2; i <= maxD; i++)
	    {
	        if(n% i == 0)
	        {
	           sum += i;
	           int d = n/i;
	           if(d!=i)
	              sum+=d;
	        }
	    }	
	    return sum + n;
	}
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}