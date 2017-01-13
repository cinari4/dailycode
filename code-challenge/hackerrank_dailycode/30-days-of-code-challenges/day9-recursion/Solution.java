import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
		sc.close();
	}
	
	public static int factorial(int i) {
		if ( i == 1) 
			return 1;
		return i * factorial(i-1);
	}
}