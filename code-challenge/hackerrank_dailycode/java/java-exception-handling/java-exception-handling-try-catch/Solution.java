import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	try {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		System.out.println(a / b);
    	} catch (InputMismatchException e) {
    		System.out.println("java.util.InputMismatchException");
    	} catch (Exception e) {
    		System.out.println(e.toString());
    	}
    	
    }
}