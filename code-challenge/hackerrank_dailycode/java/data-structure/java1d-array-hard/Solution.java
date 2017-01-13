import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestcase = sc.nextInt();
        
        for (int i = 0; i<cntTestcase; i++) {
            int cntArr = sc.nextInt();
            int jumpLength = sc.nextInt();
            jumpLength--;
            boolean result = true;
            
            int[] arrList = new int[cntArr];
            for (int j = 0; j < cntArr; j++) {
                arrList[j] = sc.nextInt();
            }
            
            for (int j = 0; j < cntArr; j++) {
                // if 0
                if (arrList[j] == 0) {
                    continue;
                } else {
                // if 1
                    if (j+jumpLength >= cntArr) {
                        break;
                    } else {
                        if (arrList[j+jumpLength] == 0) {
                            j = j + jumpLength;
                        } else {
                            result = false;
                            break;
                        }
                    }
                }
            }
            
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}