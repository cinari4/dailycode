import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int arr[] = new int[max];
        double cntZero=0.0;
        double cntMinus=0.0;
        double cntPlus=0.0;
        
        for(int i=0; i<max; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                cntZero++;
            else if(arr[i] > 0)
                cntPlus++;
            else
                cntMinus++;
        }
        
        System.out.printf("%.6f\n",cntPlus/max);
        System.out.printf("%.6f\n",cntMinus/max);
        System.out.printf("%.6f\n",cntZero/max);
        
    }
}