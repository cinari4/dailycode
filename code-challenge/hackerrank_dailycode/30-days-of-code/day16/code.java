import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[] arr = new int[T];
		  
		for(int i=0; i<T; i++)
			arr[i] = sc.nextInt();
		
		check(arr);

		
	}

	public static void check(int[] arr){
		Arrays.sort(arr);
		int abs = Integer.MAX_VALUE;
		for (int i = arr.length - 1; i > 0; i--)
			if(arr[i] - arr[i-1] < abs)
				abs = arr[i] - arr[i-1];
		for (int i = 1; i < arr.length - 1; i++) 
			if(arr[i] - arr[i-1] == abs)
				System.out.print(arr[i-1] + " " + arr[i] + " ");
	}
}