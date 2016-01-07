import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      StringBuffer sb = new StringBuffer();
      
      for(int i=0; i<T; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int N = sc.nextInt();
        
        int temp = a;
        for(int inN=0; inN<N; inN++) {
          temp = temp + ((int)Math.pow(2,inN)*b);
          sb.append(temp + " ");
        }
        sb.append("\n");
      }
      System.out.println(sb.toString());
    }
}
    

