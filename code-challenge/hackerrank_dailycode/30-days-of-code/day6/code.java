import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<T; i++) {
            for(int j=T-1; j>i; j--) {
                sb.append(" ");
            }
            for(int k=0; k<i+1; k++) {
                sb.append("#");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}