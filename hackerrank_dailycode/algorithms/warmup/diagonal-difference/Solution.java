import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int arr[][] = new int[max][max];
        
        for(int i=0; i<max; i++) {
            for(int j=0; j<max; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int diff1 = 0;
        int diff2 = 0;
        
        for(int i=0; i<max; i++) {
            diff1 += arr[i][i];
        }
        
        for(int i=0,j=max-1; i<max; i++,j--) {
            diff2 += arr[i][j];
        }
        
        System.out.println(Math.abs(diff1-diff2));
    }
}