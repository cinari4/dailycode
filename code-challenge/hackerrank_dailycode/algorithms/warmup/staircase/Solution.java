import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        
        for(int i=1; i<=max; i++) {
            for(int j=max-i; j>0; j--)
                System.out.print(" ");
            for(int k=1; k<=i; k++)
                System.out.print("#");
            System.out.println();
        }
        
    }
}