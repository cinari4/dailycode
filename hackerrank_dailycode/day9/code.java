import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
	   if(a == b) {
		   return a;
	   } else {
		   return find_gcd(Math.max(a, b)-Math.min(a, b), Math.min(a, b));
	   }
   }
}
