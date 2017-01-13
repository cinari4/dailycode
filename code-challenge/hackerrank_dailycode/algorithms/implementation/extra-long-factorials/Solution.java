import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BigInteger factorial = BigInteger.ONE;
        
        for (int i=num; i>1; i--) {
        	factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
