import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String val1 = sc.next();
        String val2 = sc.next();
        BigInteger sum = new BigInteger(val1);
        BigInteger sum1 = new BigInteger(val2);
        System.out.println(sum.add(sum1));
        System.out.println(sum.multiply(sum1));
    }
}