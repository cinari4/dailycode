import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputStr=sc.nextLine();
        StringTokenizer st = new StringTokenizer(inputStr, " ![,?.\\_'@+]");
        int i=0;
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
        	i++;
        	sb.append(st.nextToken()+"\n");
        }
        System.out.println(i);
        System.out.println(sb.toString());
    }	
}
