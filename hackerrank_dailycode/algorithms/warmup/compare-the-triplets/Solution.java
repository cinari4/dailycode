import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            b[i] = in.nextInt();
        }
        
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                sumA++;
            } else if (a[i] < b[i]) {
                sumB++;
            }
        }
        
        System.out.println(String.format("%s %s", sumA, sumB));
        
    }
}
