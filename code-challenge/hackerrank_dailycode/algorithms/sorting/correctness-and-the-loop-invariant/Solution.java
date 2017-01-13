import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] ar) {       
    	int temp;
    	for (int i=1; i < ar.length; i++) {
    		for (int j=i ; j > 0; j--) {
    			if (ar[j] < ar[j-1]) {
    				temp = ar[j];
    				ar[j] = ar[j-1];
    				ar[j-1] = temp;
    			}
    		}
    		printArray(ar);
    	}
    }  


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
