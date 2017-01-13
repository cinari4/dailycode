import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int sum = 0;
        
        while(max-->0) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
        
    }
}