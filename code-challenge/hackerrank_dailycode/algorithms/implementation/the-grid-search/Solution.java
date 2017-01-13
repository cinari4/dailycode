import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntTestCase = sc.nextInt();
        
        for(int i=0; i<cntTestCase; i++) {
            int y1 = sc.nextInt();
            int x1 = sc.nextInt();
            String[] arr1 = new String[y1];
            for(int j=0; j<y1; j++) {
                arr1[j] = sc.next();
            }
            
            int y2 = sc.nextInt();
            int x2 = sc.nextInt();
            String[] arr2 = new String[y2];
            for(int j=0; j<y2; j++) {
                arr2[j] = sc.next();
            }
            
            System.out.println(findGrid(x1, y1, arr1, x2, y2, arr2));
        }
        
    }
    
    public static String findGrid(int x1, int y1, String arr1[], int x2, int y2, String arr2[]) {
        for(int i=0; i<=y1-y2; i++) {
            int x = arr1[i].indexOf(arr2[0]);
            if(x==-1)
                continue;
            
            if(matchGrid(arr1, arr2, x, x+x2, i))
                return "YES";
            
            while(x>=0) {
                x = arr1[i].indexOf(arr2[0], x+1);
                if(x==-1)
                    break;
                if(matchGrid(arr1, arr2, x, x+x2, i))
                    return "YES";
            }
        }
        
        return "NO"; 
    }
    
    public static boolean matchGrid(String arr1[], String arr2[], int startX, int endX, int startY) {
        int tmp = startY;
        for(int i=0; i<arr2.length; i++, tmp++) {
            if(!arr1[tmp].substring(startX, endX).equals(arr2[i]))
                return false;
        }
        return true;
    }
    
}